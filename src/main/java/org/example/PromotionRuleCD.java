package org.example;

public class PromotionRuleCD implements IPromotions {
    @Override
    public double applyPromotionRules(int quantity) {
        PromotionRule promotionRule = PromotionRule.getInstance();
        return quantity*promotionRule.getSKUIDRate("CD");
    }
}
