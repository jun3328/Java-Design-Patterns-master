package Singleton;

public class PrimeMinister {

    /**
     *  정적 멤버, 블록은 클래스 로딩 시 실행
     *  클래스 로딩을 마치면 싱글톤 인스턴스를 생성하기 때문에 동기화 불필요
     */
    private static PrimeMinister instance = new PrimeMinister();

    private PrimeMinister() {}

    public static PrimeMinister getInstance(){
        return instance;
    }

}
