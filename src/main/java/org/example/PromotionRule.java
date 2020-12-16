package org.example;

import java.util.HashMap;
import java.util.Map;

public class PromotionRule {
    private static Map<String, Integer> getPromotionRate = new HashMap();

    public PromotionRule(){
        getPromotionRate.put("A", 50);
        getPromotionRate.put("B", 30);
        getPromotionRate.put("C", 20);
        getPromotionRate.put("D", 15);
        getPromotionRate.put("3A", 130);
        getPromotionRate.put("2B", 45);
    }
    public void setSKUIDwithRate(String skuId, int rate){
        getPromotionRate.put(skuId, rate);
    }
    public int getSKUIDRate(String skuId){
        return getPromotionRate.getOrDefault(skuId,0);
    }
}
