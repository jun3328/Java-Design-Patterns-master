package FactoryMethod.Factory;

import FactoryMethod.Product.Car;
import FactoryMethod.Product.Sedan;

public class SedanFactory extends CarFactory {

    @Override
    protected Car create() {
        System.out.println("세단을 제조합니다.");
        return new Sedan();
    }

    @Override
    protected void painting(String color) {
        System.out.println(color + "색으로 도색을 합니다.");
    }

    @Override
    protected void option(String option) {
        System.out.println(option + " 옵션을 추가합니다.");
    }
}
