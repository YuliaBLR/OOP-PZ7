package observer;
import java.util.ArrayList;
import java.util.Collection;

public class JobAgency implements Publisher{

    private Collection<Observer> observers = new ArrayList<>();

    public void sendOffer(String name, Collection<Vacancy> vacancies){
        for (Observer observer : observers){
            for (Vacancy vecancy: vacancies) {
                if(vecancy.getPost().equals(observer.getPost()) || observer.getPost() == "Любая должность")
                    observer.receiveOffer(name, vecancy);
            }
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public Collection<Observer> getObservers() {
        return observers;
    }
}
