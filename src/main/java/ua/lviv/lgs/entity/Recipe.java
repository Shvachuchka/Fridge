package ua.lviv.lgs.entity;

import javax.persistence.*;

@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column
    private int id_Recipe;
    @Column
    private  String nameRecipe;
    @Column
    private  String categoryRecipe;
    @Column
    private  int time_cooking;
    @Column
    private int number_products;
    @ManyToOne(fetch = FetchType.LAZY)
    private Category category;

    @ManyToOne(fetch = FetchType.LAZY)
    private Shopping shopping;

    public Recipe(){

    }

    public Recipe(int id_Recipe, String nameRecipe, String categoryRecipe, int time_cooking, int number_products) {
        this.id_Recipe = id_Recipe;
        this.nameRecipe = nameRecipe;
        this.categoryRecipe = categoryRecipe;
        this.time_cooking = time_cooking;
        this.number_products = number_products;
    }

    public int getId_Recipe() {
        return id_Recipe;
    }

    public void setId_Recipe(int id_Recipe) {
        this.id_Recipe = id_Recipe;
    }

    public String getNameRecipe() {
        return nameRecipe;
    }

    public void setNameRecipe(String nameRecipe) {
        this.nameRecipe = nameRecipe;
    }

    public String getCategoryRecipe() {
        return categoryRecipe;
    }

    public void setCategoryRecipe(String categoryRecipe) {
        this.categoryRecipe = categoryRecipe;
    }

    public int getTime_cooking() {
        return time_cooking;
    }

    public void setTime_cooking(int time_cooking) {
        this.time_cooking = time_cooking;
    }

    public int getNumber_products() {
        return number_products;
    }

    public void setNumber_products(int number_products) {
        this.number_products = number_products;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "id_Recipe=" + id_Recipe +
                ", nameRecipe='" + nameRecipe + '\'' +
                ", categoryRecipe='" + categoryRecipe + '\'' +
                ", time_cooking=" + time_cooking +
                ", number_products=" + number_products +
                '}';
    }
}
