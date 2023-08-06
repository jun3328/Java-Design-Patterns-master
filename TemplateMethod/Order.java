package TemplateMethod;

/**
 * 템플릿 메소드 패턴 (Template Method Pattern)
 *
 * 알고리즘의 구조를 상위 클래스의 메소드에 정의하고
 * 하위 클래스에서 알고리즘 구조의 변경없이
 * 알고리즘을 재정의(구현)하는 패턴
 */

public class Order {
    public static void main(String[] args) {

        System.out.println("=== 커피를 준비합니다. ===");
        Coffee coffee = new Coffee();
        coffee.prepare();

        System.out.println("=== 차를 준비합니다. ===");
        Tea tea = new Tea();
        tea.prepare();

    }
}
