package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Add Items to Cart!" );
        List<Product> cartList = new ArrayList();
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
            cartList.add(product);
            ans = in.next();
        }while(ans.equals("yes"));
        if(!cartList.isEmpty()){
            Checkout checkout = new Checkout();
        }
    }
}
