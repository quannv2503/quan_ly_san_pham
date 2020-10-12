package controller;

import model.BuyProduct;
import model.Customer;
import model.Evaluate;
import model.Product;
import service.ListData;

import java.util.ArrayList;

public class General {
    public double pay(Customer customer, ArrayList<BuyProduct> buyProducts) {
        double sum = 0;
        for (int i = 0; i < buyProducts.size(); i++) {
            // thực hiện mua từng sảm phẩm nếu còn sản pham
            if (buyProducts.get(i).getQuantityBuy() <= buyProducts.get(i).getProduct().getQuantity() && buyProducts.get(i).getQuantityBuy() > 0) {
                sum += buyProducts.get(i).getProduct().getRealPrice() * buyProducts.get(i).getQuantityBuy();
                // thực hiện sản số lượng sảm phẩm khi mua được
                for (int j = 0; j < ListData.getProducts().size(); j++) {
                    if (buyProducts.get(i).getProduct().getId() == ListData.getProducts().get(j).getId()) {
                        ListData.getProducts().get(j).setQuantity(ListData.getProducts().get(j).getQuantity() - buyProducts.get(i).getQuantityBuy());
                        break;
                    }
                }
            } else {
                // không khoả mãn xoá ra khỏi hoá đơn
                buyProducts.remove(buyProducts.get(i));
            }
        }
        // in hoá đơn khi khách hàng mua
        if (sum > 0) {
            // thêm hoá đơn vào danh sách
            addBill(customer, buyProducts);
        }
        return sum;
    }

    private void addBill(Customer customer, ArrayList<BuyProduct> buyProducts) {
        ListData.getBills().add(new Bill(customer.getName(), customer.getAddress(), customer.getPhoneNumber(), buyProducts));
        for (int i = 0; i < buyProducts.size(); i++) {
            boolean isHas = true;
            if (i == 0 && ListData.getStatisticals() == null) {
                ArrayList<Evaluate> evaluates = new ArrayList<>();
                evaluates.add(new Evaluate(customer, buyProducts.get(i).getQuantityBuy()));
                addStatistical(buyProducts.get(0).getProduct(), evaluates);
            } else {
                // kiểm tra xem sản phẩm đó có trong list chưa
                for (int j = 0; j < ListData.getStatisticals().size(); j++) {
                    // nếu có rồi
                    if (buyProducts.get(i).getProduct().getId() == ListData.getStatisticals().get(j).getId()) {
                        ListData.getStatisticals().get(j).getEvaluates().add(new Evaluate(customer, buyProducts.get(i).getQuantityBuy()));
                        isHas = false;
                        break;
                    }

                }
                // nếu chưa có
                if (isHas) {
                    ArrayList<Evaluate> evaluates = new ArrayList<>();
                    evaluates.add(new Evaluate(customer, buyProducts.get(i).getQuantityBuy()));
                    addStatistical(buyProducts.get(i).getProduct(), evaluates);
                }
            }
        }
    }

    // thêm vào danh sách thống kee
    private void addStatistical(Product product, ArrayList<Evaluate> evaluates) {
        ListData.getStatisticals().add(new Statistical(product.getName(), product.getPrice(), product.getQuantity(), product.getDiscount(), evaluates));
    }

//    public void caajpnhaj(ArrayList<Bill> bills) {
//        for (int i = 0; i < bills.size(); i++) {
//            for (int j = 0; j <bills.get(i).getBuyProducts().size() ; j++) {
//                for (int k = 0; k < ; k++) {
//
//                }
//
//            }
//        }
//    }

}
