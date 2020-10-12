package service;

import model.Customer;

import java.util.ArrayList;

public class CustomerMethod implements Method<Customer> {
    @Override
    public void add(Customer object) {
        ListData.getCustomers().add(object);
    }


    @Override
    public void delete(int id) {
        for (Customer a : ListData.getCustomers()) {
            if (a.getId() == id) {
                ListData.getCustomers().remove(a);
                break;
            }
        }
    }

    @Override
    public ArrayList<Customer> seachByName(String name) {
        return null;
    }

    @Override
    public Customer seachById(int id) {
        return null;
    }
}
