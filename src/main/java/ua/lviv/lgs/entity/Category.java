package ua.lviv.lgs.entity;

import javax.persistence.*;
import java.util.List;


@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id_Category;
    @Column
    private  String name_Category;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "category")
    private List<Recipe> recipeList;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "Products_Category", joinColumns = @JoinColumn(name = "id_Category"), inverseJoinColumns = @JoinColumn(name = "id_Products"))
    private List<Products> productsList;

    public Category(){

    }

    public Category(int id_Category, String name_Category) {
        this.id_Category = id_Category;
        this.name_Category = name_Category;
    }

    public int getId_Category() {
        return id_Category;
    }

    public void setId_Category(int id_Category) {
        this.id_Category = id_Category;
    }

    public String getName_Category() {
        return name_Category;
    }

    public void setName_Category(String name_Category) {
        this.name_Category = name_Category;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id_Category=" + id_Category +
                ", name_Category='" + name_Category + '\'' +
                '}';
    }
}