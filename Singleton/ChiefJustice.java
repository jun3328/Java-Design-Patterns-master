package Singleton;

public class ChiefJustice {

    // volatile 키워드를 사용
    private volatile static ChiefJustice instance = null;

    private ChiefJustice() {}

    /**
     * 이중체크 잠금(Double-Checked locking)
     * 인스턴스의 null 체크를 2회 진행
     */
    public static ChiefJustice getInstance() {
        if (instance == null) { // check1
            synchronized (ChiefJustice.class){
                if (instance == null) { // check2
                    instance = new ChiefJustice();
                }
            }

        }
        return instance;
    }

    /**
     *  volatile 키워드를 사용한다는 것은 다른 쓰레드가
     *  volatile 로 지정된 변수에 접근할 가능성이 있다는 것을 의미하며
     *  thread-safe 한 변수를 설정할 수 있게 해준다
     *
     *  구체적으로는 컴파일러가 특정 변수에 대해 optimizer 가
     *  캐싱을 적용하지 못하도록 하는 키워드
     *
     *  멀티 스레드에서 for 나 while 문이 옵티마이져에 의해 캐싱(caching)을 사용하는데,
     *  이 때 동기화 문제가 발생할 수 있다. 한 스레드에서 다른 스레드의 작업이 마치기를
     *  기다린다고 가정했을 때, 최신의 변수를 읽어오지 못한다면 무한루프에 빠질 수 있다.
     *
     *  synchronized 는 작업 자체를 원자화 하지만
     *  volatile 은 특정 변수에 대해서 최신 값을 제공한다.
     */

}
