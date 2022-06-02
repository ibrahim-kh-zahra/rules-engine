package com.example.rulesengine.rules;

import com.example.rulesengine.RuleEngine;
import com.example.rulesengine.model.LineItem;

public class Rule2 extends Rule {

    @Override
    public boolean isMatch(final LineItem priorYearItem, final LineItem currentYearItem) {

        boolean res = super.isMatch(priorYearItem, currentYearItem);
        if (!res) {
            return false;
        }
        return priorYearItem.getReferenceId()
                            .equals(currentYearItem.getReferenceId()) && priorYearItem.getReferenceId()
                                                                                      .equals(currentYearItem.getReferenceId()) &&
               priorYearItem.getAcquisitionCost()
                            .equals(currentYearItem.getAcquisitionCost());
    }

    @Override
    public void register() {
        Rule2 rule2=new Rule2();
        setPriority(2);
        RuleEngine.register(rule2);
    }
}
