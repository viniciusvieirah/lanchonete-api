package br.com.lanchoneteapi.model;

public enum IngredientsEnum {

    ALFACE("alface", 0.40) , BACON("baccon",2.0) , HAMBURGUER("hamburguer",3.0), OVO("ovo",0.80), QUEIJO("queijo",1.50);

    private String name;
    private Double cost;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }



    IngredientsEnum(String name,  Double cost){
        this.name = name;
        this.cost = cost;
    }
}
