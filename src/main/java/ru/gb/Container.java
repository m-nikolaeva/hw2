package ru.gb;

import java.util.ArrayList;
import java.util.List;

public class Container implements Element{
    private List<Element> containers = new ArrayList<>();

    public void addContainer(Element component){
        containers.add(component);
    }

    public void deleteContainer(Element component){
        containers.remove(component);
    }

    @Override
    public Long getValuation() {
        long valuation = 0L;
        for (Element component : containers){
            valuation += component.getValuation();
        }
        return valuation;
    }
}
