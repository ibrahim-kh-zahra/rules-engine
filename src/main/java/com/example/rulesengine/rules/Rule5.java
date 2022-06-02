package com.example.rulesengine.rules;

import com.example.rulesengine.RuleEngine;
import com.example.rulesengine.model.LineItem;

public class Rule5 extends Rule {

    @Override
    public boolean isMatch(final LineItem priorYearItem, final LineItem currentYearItem) {

        boolean res = super.isMatch(priorYearItem, currentYearItem);
        if (!res) {
            return false;
        }
        return priorYearItem.getDescription()
                            .equals(currentYearItem.getDescription());
    }

    @Override
    public void register() {
        Rule5 rule5=new Rule5();
        setPriority(5);
        RuleEngine.register(rule5);
    }
}
