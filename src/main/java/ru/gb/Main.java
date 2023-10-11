package ru.gb;

public class Main {
    public static void main(String[] args) {
        Container crisper = new Container();
        Container box1 = new Container();
        Container box2 = new Container();
        Component component1 = new Component(5L);
        Component component2 = new Component(10L);
        Component component3 = new Component(25L);

        box1.addContainer(component2);
        box1.addContainer(component3);
        box2.addContainer(component1);
        box2.addContainer(component3);
        box2.deleteContainer(component1);
        crisper.addContainer(box1);
        crisper.addContainer(box2);

        Long valuation = crisper.getValuation();
        System.out.println("Общая ценность контейнера: " + valuation);
    }
}