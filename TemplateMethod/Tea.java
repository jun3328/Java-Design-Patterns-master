package TemplateMethod;

public class Tea extends CaffeineBeverage {

    @Override
    protected void brew() {
        System.out.println("차를 우려 냅니다.");
    }

    @Override
    protected void addCondiments() {

    }
}
