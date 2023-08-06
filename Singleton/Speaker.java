package Singleton;

/**
 *  enum 은 태생부터 싱글톤이라 생성과정은 JVM이 알아서 처리
 */

public enum  Speaker {
    INSTANCE;

    public static Speaker getInstance(){
        return INSTANCE;
    }
}
