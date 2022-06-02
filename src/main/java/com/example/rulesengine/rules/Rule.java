package com.example.rulesengine.rules;


import com.example.rulesengine.model.LineItem;

import java.util.List;
import java.util.stream.Collectors;

public abstract class Rule{

    protected int priority = Integer.MAX_VALUE;

    public  List<LineItem> match(List<LineItem> priorYearItems, LineItem currentYearItem){
       return priorYearItems.stream().filter(priorYearItem->isMatch(priorYearItem,currentYearItem)).collect(Collectors.toList());
    }

    public  boolean isMatch(LineItem priorYearItems, LineItem currentYearItem){
        if(priorYearItems.getCategory().equals(currentYearItem.getCategory())&&priorYearItems.getYearAcquired().equals(currentYearItem.getYearAcquired())){
            return true;
        }
        return false;
    }

    public abstract void register();

    public int getPriority() {

        return this.priority;
    }

    public void setPriority(int priority) {

        this.setPriority(priority);
    }
}
