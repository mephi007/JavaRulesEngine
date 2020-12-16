package org.example;


public class Cart {
    SKU SkuId;
    int quantity;

    public Cart(SKU skuid, int qu){
        this.SkuId = skuid;
        this.quantity = qu;
    }
}
