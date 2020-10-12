package main;

import controller.General;
import service.CustomerMethod;
import service.ListData;
import controller.Bill;
import model.BuyProduct;
import view.Display;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        CustomerMethod customerMethod = new CustomerMethod();
        General general = new General();
        Display.disPlayListProduct(ListData.getProducts());
        ArrayList<BuyProduct> buyProducts = new ArrayList<>();
        buyProducts.add(new BuyProduct(ListData.getProducts().get(0), 4));
        buyProducts.add(new BuyProduct(ListData.getProducts().get(1), 2));
        System.out.println(general.pay(ListData.getCustomers().get(0), buyProducts));
        Display.disPlayListProduct(ListData.getProducts());
        System.out.println(ListData.getBills().get(0).getBuyProducts().get(0));
        System.out.println(ListData.getBills().get(0).getBuyProducts().get(0).getProduct().getQuantity());


    }
}
