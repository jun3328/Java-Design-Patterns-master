package Facade;

import Facade.Coffee.EspressoMachine;
import Facade.Computer.Desktop;

/**
 * 퍼사드 패턴 (facade pattern)
 *
 * 단순화된 인터페이스를 제공하는 디자인 패턴
 * 복잡한 아키텍처를 숨기고, 간략한 인터페이스로 접근·사용하도록 추상화하는 디자인 패턴
 *
 */

public class Home {
    public static void main(String[] args) {

        // pc를 동작시키는 일련의 과정을 퍼사드 패턴으로 처리
        Desktop desktop = new Desktop();
        desktop.powerOn();

        // 에스프레소를 추출하는 일련의 과정을 퍼사드 패턴으로 처리
        EspressoMachine espressoMachine = new EspressoMachine();
        espressoMachine.extract();

    }
}
