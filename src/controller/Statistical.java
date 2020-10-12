package controller;

import model.Evaluate;
import model.Product;

import java.util.ArrayList;

public class Statistical extends Product {
    ArrayList<Evaluate> evaluates = new ArrayList<>();

    public Statistical(ArrayList<Evaluate> evaluates) {
        this.evaluates = evaluates;
    }

    public Statistical(String name, double price, int quantity, int discount, ArrayList<Evaluate> evaluates) {
        super(name, price, quantity, discount);
        this.evaluates = evaluates;
    }

    public ArrayList<Evaluate> getEvaluates() {
        return evaluates;
    }

    public void setEvaluates(ArrayList<Evaluate> evaluates) {
        this.evaluates = evaluates;
    }

}
