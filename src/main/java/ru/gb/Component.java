package ru.gb;

public class Component implements Element{
    private Long valuation;

    public Component(Long valuation) {
        this.valuation = valuation;
    }

    @Override
    public Long getValuation() {
        return valuation;
    }
}
