package ua.lviv.lgs.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Shopping{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id_Shopping;
    @Column
    private int quantity_Shopping;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "shopping")
    private List<Products>productsList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "shopping")
    private List<Recipe>recipeList;


    public Shopping(){

    }

    public Shopping(int id_Shopping,int quantity_Shopping) {
        this.id_Shopping = id_Shopping;
        this.quantity_Shopping = quantity_Shopping;
    }

    public int getId_Shopping() {
        return id_Shopping;
    }

    public void setId_Shopping(int id_Shopping) {
        this.id_Shopping = id_Shopping;
    }

    public int getQuantity_Shopping() {
        return quantity_Shopping;
    }

    public void setQuantity_Shopping(int quantity_Shopping) {
        this.quantity_Shopping = quantity_Shopping;
    }

    @Override
    public String toString() {
        return "Shopping{" +
                "id_Shopping=" + id_Shopping +
                ", quantity_Shopping=" + quantity_Shopping +
                '}';
    }
}
