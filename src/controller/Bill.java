package controller;

import service.ListData;
import model.BuyProduct;
import model.Customer;

import java.util.ArrayList;

public class Bill extends Customer { // hoá đơn
    private ArrayList<BuyProduct> buyProducts;

    public Bill() {
    }

    public Bill(String name, String address, String phoneNumber) {
        super(name, address, phoneNumber);
    }

    public Bill(ArrayList<BuyProduct> buyProducts) {
        this.buyProducts = buyProducts;
    }

    public Bill(String name, String address, String phoneNumber, ArrayList<BuyProduct> buyProducts) {
        super(name, address, phoneNumber);
        this.buyProducts = buyProducts;
    }

    public ArrayList<BuyProduct> getBuyProducts() {
        return buyProducts;
    }

    public void setBuyProducts(ArrayList<BuyProduct> buyProducts) {
        this.buyProducts = buyProducts;
    }
}

