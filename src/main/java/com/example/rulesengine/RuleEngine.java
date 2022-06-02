package com.example.rulesengine;



import com.example.rulesengine.model.LineItem;
import com.example.rulesengine.rules.IRuleEngine;
import com.example.rulesengine.rules.Rule;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RuleEngine
    implements IRuleEngine {

    private static List<Rule> rules = new ArrayList<>();

    public static void register(Rule rule) {

        rules.add(rule);
    }

    public Map<LineItem, LineItem> match(final List<LineItem> priorYearItems, final List<LineItem> currentYearItems) {

        Map<LineItem, LineItem> results = new HashMap<>();
        Collections.sort(rules, (r1, r2) -> r1.getPriority() - r2.getPriority());
        for (LineItem lineItem : currentYearItems) {
            for (Rule r : rules) {
                List<LineItem> res = r.match(priorYearItems, lineItem);
                if (!res.isEmpty()) {
                    priorYearItems.remove(res.get(0));
                    results.put(lineItem, res.get(0));
                    break;
                }
            }
        }

        return results;
    }
}
