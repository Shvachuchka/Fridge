package ua.lviv.lgs.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Refrigerator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private  int id_Refrigerator;
    @Column
    private String address_Refrigerator;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "Refrigerator_Products", joinColumns = @JoinColumn(name = "id_Refrigerator"), inverseJoinColumns = @JoinColumn(name = "id_Products"))
    private List<Products> productsList;

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "refrigerator")
    private List<People>peopleList;


    public Refrigerator(){

    }

    public List<Products> getProductsList() {
        return productsList;
    }

    public void setProductsList(List<Products> productsList) {
        this.productsList = productsList;
    }

    public List<People> getPeopleList() {
        return peopleList;
    }

    public void setPeopleList(List<People> peopleList) {
        this.peopleList = peopleList;
    }

    public Refrigerator(int id_Refrigerator, String address_Refrigerator) {
        this.id_Refrigerator = id_Refrigerator;
        this.address_Refrigerator = address_Refrigerator;
    }

    public int getId_Refrigerator() {
        return id_Refrigerator;
    }

    public void setId_Refrigerator(int id_Refrigerator) {
        this.id_Refrigerator = id_Refrigerator;
    }

    public String getAddress_Refrigerator() {
        return address_Refrigerator;
    }

    public void setAddress_Refrigerator(String address_Refrigerator) {
        this.address_Refrigerator = address_Refrigerator;
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "id_Refrigerator=" + id_Refrigerator +
                ", address_Refrigerator='" + address_Refrigerator + '\'' +
                '}';
    }
}
