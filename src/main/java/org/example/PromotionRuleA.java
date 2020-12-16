package org.example;

public class PromotionRuleA implements IPromotions {
    @Override
    public double applyPromotionRules(int quantity) {
        int bundleOfThree = quantity/3;
        int remainder = quantity%3;
        PromotionRule promotionRule = PromotionRule.getInstance();
        return bundleOfThree*promotionRule.getSKUIDRate("3A") + remainder*promotionRule.getSKUIDRate("A");
    }
}
