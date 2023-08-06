package Singleton;

public class President {

    private static President instance;

    // 외부에서 인스턴스화를 방지
    private President() {}

    // 멀티스레드 환경에서 인스턴스의 추가 생성을 방지하기 위해
    // 동기화(synchronized) 키워드 추가 (method 동기화는 성능이 저하됨)
    public static synchronized President getInstance() {
        if (instance == null) {
            instance = new President();
        }
        return instance;
    }

}
