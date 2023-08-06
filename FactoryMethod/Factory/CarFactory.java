package FactoryMethod.Factory;

import FactoryMethod.Product.Car;

public abstract class CarFactory {

    // Factory Method 를 포함한 생성로직을 제공하는 framework
    public final Car manufacturing(String color, String option){
        Car car = create();
        painting(color);
        option(option);
        return car;
    }

    protected abstract Car create(); // Factory Method : 하위 클래스 에서 구현

    protected abstract void painting(String color);

    protected abstract void option(String option);

}
