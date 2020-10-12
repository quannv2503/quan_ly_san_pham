package view;

import model.Customer;
import model.Product;

import java.util.ArrayList;

public class Display {
    static public void disPlayListProduct(ArrayList<Product> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("id:" + arrayList.get(i).getId() + " ten:" + arrayList.get(i).getName() +
                    " gia:" + arrayList.get(i).getPrice() + " so lương:" + arrayList.get(i).getQuantity()
                    + " giảm giá tới:" + arrayList.get(i).getDiscount() + "%");
        }
    }

    static public void disPlayListCustomer(ArrayList<Customer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("id:" + arrayList.get(i).getId() + " ten:" + arrayList.get(i).getName() +
                    " dia chỉ:" + arrayList.get(i).getAddress() + " sdt:" + arrayList.get(i).getPhoneNumber());
        }
    }
}
