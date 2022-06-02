package com.example.rulesengine.rules;

import com.example.rulesengine.RuleEngine;
import com.example.rulesengine.model.LineItem;

import java.util.Collections;
import java.util.List;

public class Rule6
    extends Rule {

    @Override()
    public List<LineItem> match(List<LineItem> items, LineItem currentYearItem) {

        List<LineItem> res = super.match(items, currentYearItem);
        if (!res.isEmpty()) {
            Collections.sort(
                res,
                (r1, r2) -> r1.getAcquisitionCost()
                              .compareTo(r2.getAcquisitionCost()));
        }
        return res;
    }

    @Override
    public void register() {

        Rule6 rule6 = new Rule6();
        setPriority(6);
        RuleEngine.register(rule6);
    }
}
