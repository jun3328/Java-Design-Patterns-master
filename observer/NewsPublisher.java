package Observer;

import java.util.Observer;

public interface NewsPublisher {

    void addNews(String newsItem);

    void register(Observer observer);

    void unRegister(Observer observer);

}
