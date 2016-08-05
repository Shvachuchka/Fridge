package ua.lviv.lgs.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Products {

    @Id
    @GeneratedValue (strategy= GenerationType.IDENTITY)
    @Column
    private  int id_Products;
    @Column
    private  String nameProducts;
    @Column
    private  int Calories;
    @Column
    @Lob
    private byte[] fotoProducts= new byte[1];

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "Refrigerator_Products", joinColumns = @JoinColumn(name = "id_Products"), inverseJoinColumns = @JoinColumn(name = "id_Refrigerator"))
    private List<Refrigerator> refrigeratorList;

    @ManyToOne(fetch = FetchType.LAZY)
    private Shopping shopping;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "Products_Category", joinColumns = @JoinColumn(name = "id_Products"), inverseJoinColumns = @JoinColumn(name = "id_Category"))
    private List<Category>categoryList;


    public Products(){

    }

    public Products(int id_Products, String nameProducts, int calories, byte[] fotoProducts) {
        this.id_Products = id_Products;
        this.nameProducts = nameProducts;
        this.Calories = calories;
        this.fotoProducts = fotoProducts;
    }

    public int getId_Products() {
        return id_Products;
    }

    public void setId_Products(int id_Products) {
        this.id_Products = id_Products;
    }

    public String getNameProducts() {
        return nameProducts;
    }

    public void setNameProducts(String nameProducts) {
        this.nameProducts = nameProducts;
    }

    public int getCalories() {
        return Calories;
    }

    public void setCalories(int calories) {
        Calories = calories;
    }

    public byte[] getFotoProducts() {
        return fotoProducts;
    }

    public void setFotoProducts(byte[] fotoProducts) {
        this.fotoProducts =  fotoProducts;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id_Products=" + id_Products +
                ", nameProducts='" + nameProducts + '\'' +
                ", Calories=" + Calories +
                ", fotoProducts=" + fotoProducts +
                '}';
    }
}
