package org.example;

public class PromotionRuleD implements IPromotions {
    @Override
    public double applyPromotionRules(int quantity) {
        PromotionRule promotionRule = PromotionRule.getInstance();
        return quantity*promotionRule.getSKUIDRate("D");
    }
}
