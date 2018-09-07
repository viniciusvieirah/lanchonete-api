package br.com.lanchoneteapi.model;

import java.util.ArrayList;

public class PurchaseModel {

    private double totalCost;
    private ArrayList<Lunch> lunchs = new ArrayList<>();

    public ArrayList<Lunch> getLunchs() {
        return lunchs;
    }

    public void setLunchs(ArrayList<Lunch> lunchs) {
        this.lunchs = lunchs;
    }
}
