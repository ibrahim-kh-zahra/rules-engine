package com.example.rulesengine.rules;


import com.example.rulesengine.RuleEngine;
import com.example.rulesengine.model.LineItem;

public class Rule4 extends Rule {


    @Override
    public boolean isMatch(final LineItem priorYearItem, final LineItem currentYearItem) {

        boolean res = super.isMatch(priorYearItem, currentYearItem);
        if (!res) {
            return false;
        }
        return priorYearItem.getAcquisitionCost()
                            .equals(currentYearItem.getAcquisitionCost());
    }

    @Override
    public void register() {
        Rule4 rule4=new Rule4();
        setPriority(4);
        RuleEngine.register(rule4);
    }
}
