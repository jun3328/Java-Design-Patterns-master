package FactoryMethod;

import FactoryMethod.Factory.CarFactory;
import FactoryMethod.Factory.CoupeFactory;
import FactoryMethod.Factory.SedanFactory;
import FactoryMethod.Product.Car;

/**
 * 팩토리 메소드 패턴 (Factory Method Pattern)
 *
 * Factory 는 객체를 생성하는 생산자를 의미
 * Method 는 Template Method 패턴에서 차용.
 *
 * Factory Method 패턴에서는 객체의 생성 직후에 해야 할 일을
 * 순서대로 정의한 메소드를 제공하고 구체적인 생성은 구체 클래스들에 위임한다.
 *
 */

public class Manager {
    public static void main(String[] args) {

        CarFactory carFactory;
        Car sedan, coupe;


        carFactory = new SedanFactory();
        sedan = carFactory.manufacturing("검정","가죽시트");
        sedan.testDrive();

        System.out.println();

        carFactory = new CoupeFactory();
        coupe = carFactory.manufacturing("파랑","헤드 업 디스플레이");
        coupe.testDrive();

    }
}
