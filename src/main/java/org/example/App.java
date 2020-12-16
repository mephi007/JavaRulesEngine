package org.example;

import java.util.*;
import java.util.Map.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Add Items to Cart!" );
        Map<String, Integer> cartList = new HashMap();
        System.out.println("Enter Product SKU Id and Quantity");
        String ans;
        do{
            Scanner in = new Scanner(System.in);
            System.out.println("Enter SKU id");
            String skuId = in.next();
            System.out.println("Enter Quantity");
            int quantity = in.nextInt();
            Product product = new Product(SKU.valueOf(skuId), quantity);
            System.out.println("Do you want to add more items to cart, write as \"yes\" or \"no\" ");
            cartList.put(skuId, cartList.getOrDefault(skuId,0)+quantity);
            ans = in.next();
        }while(ans.equals("yes"));
        if(!cartList.isEmpty()){
            for(Entry<String, Integer> pr : cartList.entrySet()){
                System.out.println(pr.getKey()+" "+pr.getValue());
            }
            Checkout checkout = new Checkout();
            checkout.processItem(cartList);
        }
    }
}
