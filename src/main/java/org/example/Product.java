package org.example;


public class Product {
    private SKU SkuId;
    private int quantity;

    public Product(SKU skuid, int qu){
        this.SkuId = skuid;
        this.quantity = qu;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public SKU getSkuId() {
        return SkuId;
    }

    public void setSkuId(SKU skuId) {
        SkuId = skuId;
    }
}
