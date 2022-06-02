package com.example.rulesengine.rules;

import com.example.rulesengine.RuleEngine;
import com.example.rulesengine.model.LineItem;

public class Rule3 extends Rule {

    @Override
    public boolean isMatch(final LineItem priorYearItem, final LineItem currentYearItem) {

        boolean res = super.isMatch(priorYearItem, currentYearItem);
        if (!res) {
            return false;
        }
        return priorYearItem.getDescription()
                            .equals(currentYearItem.getDescription()) && priorYearItem.getReferenceId()
                                                                                      .equals(currentYearItem.getReferenceId()) &&
               priorYearItem.getAcquisitionCost()
                            .equals(currentYearItem.getAcquisitionCost());
    }

    @Override
    public void register() {
        Rule3 rule3=new Rule3();
        setPriority(3);
        RuleEngine.register(rule3);
    }
}
