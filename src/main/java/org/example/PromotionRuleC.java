package org.example;

public class PromotionRuleC implements IPromotions {
    @Override
    public double applyPromotionRules(int quantity) {
        PromotionRule promotionRule = PromotionRule.getInstance();
        return quantity*promotionRule.getSKUIDRate("C");
    }
}
