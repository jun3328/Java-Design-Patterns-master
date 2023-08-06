package Singleton;

/**
 * 싱글톤 패턴(Singleton Pattern)
 * 오직 하나만 생성해야할 객체가 필요할 때 사용하는 패턴
 *
 * President        : synchronized 키워드 이용
 * PrimeMinister    : 정적 초기화 시 생성
 * ChiefJustice     : Double-checking Locking
 * Speaker          : enum 이용
 */

public class Korea {
    public static void main(String[] args) {
        // 생성자의 private 키워드가 있기 때문에 new 키워드를 통한 인스턴스 생성불가
        President president1 = President.getInstance();
        President president2 = President.getInstance();

        PrimeMinister primeMinister1 = PrimeMinister.getInstance();
        PrimeMinister primeMinister2 = PrimeMinister.getInstance();

        ChiefJustice chiefJustice1 = ChiefJustice.getInstance();
        ChiefJustice chiefJustice2 = ChiefJustice.getInstance();

        Speaker speaker1 = Speaker.INSTANCE;
        Speaker speaker2 = Speaker.getInstance();

        // 오직 하나의 인스턴스만 생성되기 때문에 동일한 값 출력
        System.out.println(president1);
        System.out.println(president2);

        System.out.println(primeMinister1);
        System.out.println(primeMinister2);

        System.out.println(chiefJustice1);
        System.out.println(chiefJustice2);

        System.out.println(speaker1);
        System.out.println(speaker2);
    }
}
