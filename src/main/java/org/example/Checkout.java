package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.*;

public class Checkout {
//    public static Map<String, IPromotions> getPromotionRuleObject = new HashMap();
//    getPromotionRuleObject.put("A", new Checkout());

    public void processItem(Map<String, Integer> cartList) {
        double payableAmt = 0;
        IPromotions promtionsRule = null;
        for(Entry<String,Integer> pr: cartList.entrySet()){
            if(pr.getKey().equals("A")){
                promtionsRule = new PromotionRuleA();
            }else if(pr.getKey().equals("B")){
                promtionsRule = new PromotionRuleB();
            }
        }
    }
}
