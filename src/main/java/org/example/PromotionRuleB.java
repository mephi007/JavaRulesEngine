package org.example;

public class PromotionRuleB implements IPromotions {
    @Override
    public double applyPromotionRules(int quantity) {
        int bundleOfTwo = quantity/2;
        int remainder = quantity%2;
        PromotionRule promotionRule = PromotionRule.getInstance();
        return bundleOfTwo*promotionRule.getSKUIDRate("2B") + remainder*promotionRule.getSKUIDRate("B");
    }
}
