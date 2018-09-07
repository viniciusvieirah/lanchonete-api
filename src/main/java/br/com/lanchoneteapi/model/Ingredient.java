package br.com.lanchoneteapi.model;


public class Ingredient {


    private String name ;
    private int qtd ;
    private Double cost ;

    public Ingredient(){};

    public Ingredient(IngredientsEnum ingredient, int qtd){
       this.name = ingredient.getName();
       this.cost = ingredient.getCost();
       this.qtd = qtd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }





}
