package com.example.rulesengine.rules;

import com.example.rulesengine.RuleEngine;
import com.example.rulesengine.model.LineItem;

public class Rule1 extends Rule {

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

        Rule1 rule = new Rule1();
        rule.setPriority(1);
        RuleEngine.register(rule);
    }


}
