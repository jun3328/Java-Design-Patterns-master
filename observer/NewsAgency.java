package Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class NewsAgency extends Observable implements NewsPublisher {

    private List<Observer> newsChannels = new ArrayList<>();

    @Override
    public void addNews(String newsItem) {
        notifyObservers(newsItem);
    }

    @Override
    public void register(Observer observer) {
        newsChannels.add(observer);
    }

    @Override
    public void unRegister(Observer observer) {
        newsChannels.remove(observer);
    }

    @Override
    public void notifyObservers(Object newsItem) {
        for (Observer channel : newsChannels) {
            channel.update(this, newsItem);
        }
    }

}
