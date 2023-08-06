package Observer;

import java.util.Observable;
import java.util.Observer;

public class TVChannel implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof NewsPublisher) {
            System.out.println("TV 에서 전하는 뉴스 : " + arg);
        }
    }
}
