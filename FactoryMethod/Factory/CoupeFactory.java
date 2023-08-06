package FactoryMethod.Factory;

import FactoryMethod.Product.Car;
import FactoryMethod.Product.Coupe;

public class CoupeFactory extends CarFactory {

    @Override
    protected Car create() {
        System.out.println("쿠페를 제조합니다.");
        return new Coupe();
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
