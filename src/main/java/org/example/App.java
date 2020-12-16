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
            ValidSKUID validSKUID = ValidSKUID.getInstance();
            if(validSKUID.containsSKUID(skuId)) {
                System.out.println("Enter Quantity");
                 int quantity = in.nextInt();
                cartList.put(skuId, cartList.getOrDefault(skuId,0)+quantity);
            }else{
                System.out.println("SKUID do not exist");
            }
            System.out.println("Do you want to add more items to cart, write as \"yes\" or \"no\" ");
            ans = in.next();
        }while(ans.equals("yes"));
        if(!cartList.isEmpty()){
            System.out.println("Items in the Cart:");
            for(Entry<String, Integer> pr : cartList.entrySet()){
                System.out.println(pr.getKey()+" "+pr.getValue());
            }
            Checkout checkout = new Checkout();
            System.out.println("Total Payable Amount "+checkout.processItem(cartList));
        }else{
            System.out.println("Cart is Empty");
        }
    }
}
