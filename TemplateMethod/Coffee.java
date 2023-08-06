package TemplateMethod;

public class Coffee extends CaffeineBeverage {

    @Override
    protected void brew() {
        System.out.println("필터를 통해 커피를 내립니다.");
    }

    @Override
    protected boolean isNeedCondiments() {
        return true;
    }

    @Override
    protected void addCondiments() {
        System.out.println("우유와 설탕을 첨가합니다.");
    }
}
