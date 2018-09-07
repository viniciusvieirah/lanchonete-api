package br.com.lanchoneteapi.model;

import java.util.ArrayList;

public class Lunch {

    private String name;
    private ArrayList<Ingredient> ingredients ;
    private Double cost;


    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }



}
