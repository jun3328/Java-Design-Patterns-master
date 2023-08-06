package Builder;

/**
 * 생성자의 매개변수가 많은 경우에 빌더패턴 사용을 고려할 수 있다.
 * <p>
 * 불필요한 생성자들을 만들지 않고 객체를 만들수 있고
 * 데이터의 순서에 상관 없이 객체를 만들어 낼 수 있다.
 */

public class Main {
    public static void main(String[] args) {

        /**
         *  빌더 객체의 Method Chaining 을 통해
         *  Computer 객체의 멤버 변수를 명시적으로 정의하고 (순서에 상관 없이)
         *  마지막에 build() 메서드를 호출하여 정의된 객체를 반환
         */
        Computer computer = new Computer.Builder()
                .cpu("i7")
                .ssd("512GB")
                .ram("16GB")
                .gpu("RTX2060")
                .hdd("1TB")
                .power("600W")
                .build();

        System.out.println(computer);
    }
}
