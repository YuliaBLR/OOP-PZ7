package observer;

import java.util.Collection;

public interface Publisher {
    void sendOffer(String name, Collection<Vacancy> vacancies);

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);
    public Collection<Observer> getObservers();
}
