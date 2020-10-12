package service;

import model.Product;

import java.util.ArrayList;

public class ProductMethod implements Method<Product> {
    @Override
    public void add(Product object) {
        ListData.getProducts().add(object);
    }

    @Override
    public void delete(int id) {
        for (Product a : ListData.getProducts()) {
            if (id == a.getId()) {
                ListData.getProducts().remove(a);
                break;
            }
        }
    }

    @Override
    public ArrayList<Product> seachByName(String name) {
        return null;
    }

    @Override
    public Product seachById(int id) {
        return null;
    }
}
