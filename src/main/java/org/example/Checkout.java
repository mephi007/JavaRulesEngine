package org.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.*;

public class Checkout {
//    public static Map<String, IPromotions> getPromotionRuleObject = new HashMap();
//    getPromotionRuleObject.put("A", new Checkout());

    public double processItem(Map<String, Integer> cartList) {
        double payableAmt = 0;
        IPromotions promotionsRule = null;
        Map<String, Integer> leftoverOfCD= new HashMap();
        Iterator<Map.Entry<String,Integer>> itr = cartList.entrySet().iterator();
        while(itr.hasNext()){
            int quantity = 0;
            Entry<String,Integer> pr = itr.next();
            if(pr.getValue() == 0) continue;
            if(pr.getKey().equals("A")){
                promotionsRule = new PromotionRuleA();
                quantity = pr.getValue();
            }else if(pr.getKey().equals("B")){
                promotionsRule = new PromotionRuleB();
                quantity = pr.getValue();
            }
            else{
                if((pr.getKey().equals("C") && cartList.containsKey("D")) || (pr.getKey().equals("D")
                        && cartList.containsKey("C"))){
                    promotionsRule = new PromotionRuleCD();
                    quantity = modifyingCandD(cartList, pr, leftoverOfCD, itr);
                }else if(pr.getKey().equals("C")){
                    promotionsRule = new PromotionRuleC();
                    quantity = pr.getValue();
                }else{
                    promotionsRule = new PromotionRuleD();
                    quantity = pr.getValue();
                }
            }

            payableAmt += promotionsRule.applyPromotionRules(quantity);
        }
        int quantity = 0;
        for(String pr :leftoverOfCD.keySet()){
            if(pr.equals("C")){
                promotionsRule = new PromotionRuleC();
                quantity = leftoverOfCD.get(pr);
            }else{
                promotionsRule = new PromotionRuleD();
                quantity = leftoverOfCD.get(pr);
            }
        }
        payableAmt += promotionsRule.applyPromotionRules(quantity);
        return payableAmt;
    }

    private int modifyingCandD(Map<String, Integer> cartList, Entry<String, Integer> pr, Map<String, Integer> leftoverOfCD, Iterator<Entry<String, Integer>> itr) {
        int leftover = 0;
        int quantity = 0;
        String counter = pr.getKey().equals("C")?"D":"C";
        if(pr.getValue() > cartList.get(counter)){
            quantity = cartList.get(counter);
            leftover = pr.getValue() - cartList.get(counter);
            leftoverOfCD.put(pr.getKey(), leftover);
            cartList.put(counter, 0);
        }else if(pr.getValue() <= cartList.get(counter)){
            quantity = pr.getValue();
            leftover = cartList.get(counter) - pr.getValue();
            leftoverOfCD.put(counter, leftover);
        }

        return quantity;
    }
}
