package service;

import controller.Bill;
import controller.Statistical;
import model.Customer;
import model.Product;

import java.util.ArrayList;

public class ListData {
    static private ArrayList<Customer> customers = new ArrayList<>();
    static private ArrayList<Product> products = new ArrayList<>();

    static {
        customers.add(new Customer("nguyen van quan", "ha noi", "334323"));
        customers.add(new Customer("nguyen quoc anh", "ca mau", "45453"));
        customers.add(new Customer("nguyen thi ngoc anh", "ha noi", "4444"));
        products.add(new Product("iphone", 3000, 5, 0));
        products.add(new Product("ipad", 4000, 4, 0));
        products.add(new Product("samsung", 5000, 2, 20));
    }


    static private ArrayList<Bill> bills = new ArrayList<>();
    static private ArrayList<Statistical> statisticals = new ArrayList<>();

    public static ArrayList<Customer> getCustomers() {
        return customers;
    }

    public static void setCustomers(ArrayList<Customer> customers) {
        ListData.customers = customers;
    }

    public static ArrayList<Product> getProducts() {
        return products;
    }

    public static void setProducts(ArrayList<Product> products) {
        ListData.products = products;
    }

    public static ArrayList<Bill> getBills() {
        return bills;
    }

    public static void setBills(ArrayList<Bill> bills) {
        ListData.bills = bills;
    }

    public static ArrayList<Statistical> getStatisticals() {
        return statisticals;
    }

    public static void setStatisticals(ArrayList<Statistical> statisticals) {
        ListData.statisticals = statisticals;
    }
}