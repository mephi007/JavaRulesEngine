package org.example;

import java.util.HashMap;
import java.util.Map;

public class PromotionRule {
    private Map<String, Integer> getPromotionRate = new HashMap();
    private static PromotionRule promotionRule;
    private PromotionRule(){
        getPromotionRate.put("A", 50);
        getPromotionRate.put("B", 30);
        getPromotionRate.put("C", 20);
        getPromotionRate.put("D", 15);
        getPromotionRate.put("3A", 130);
        getPromotionRate.put("2B", 45);
    }
    public static PromotionRule getInstance(){
        if(promotionRule == null){
            promotionRule = new PromotionRule();
        }
        return promotionRule;
    }
    public void setSKUIDwithRate(String skuId, int rate){
        getPromotionRate.put(skuId, rate);
    }
    public int getSKUIDRate(String skuId){
        return getPromotionRate.getOrDefault(skuId,0);
    }
}
