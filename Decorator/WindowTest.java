package Decorator;

/**
 *  장식자(Decorator) 패턴은 객체에 동적으로 기능을 붙이는 패턴
 *
 *  장식자 패턴은 동일한 인터페이스를 구현한 컴포넌트와 장식자 객체로 구성된다
 *  같은 인터페이스를 구현한 인스턴스 변수가 있기에 컴포넌틑 객체나 다른 장식자를 감쌀 수 있고
 *  기반 컴포넌트나 다른 장식자도 장식할 수 있다.
 *
 */

public class WindowTest {

    public static void main(String[] args) {

        Window decoratedWindow
                = new HorizontalScrollBarDecorator(new VerticalScrollBarDecorator(new SimpleWindow()));

        decoratedWindow.draw();

        System.out.println(decoratedWindow.getDescription());



    }
}
