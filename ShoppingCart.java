package Buyer;

import java.util.ArrayList;
import java.util.Iterator;

public class ShoppingCart extends BuyerAbs{
    ArrayList<Product> listProduct = new Product();
    private PaymentM pay;
    private boolean verifiedP = false;

    public void addToCart(Product p){
        listProduct.add(p);
    }
    public void deleteProduct(Product p){
        listProduct.remove(1);
    }
    public void printCart(){
        Iterator it = listProduct.iterator();
        while(listProduct.iterator().hasNext()){
            System.out.println(it.next());
        }

    }
}
