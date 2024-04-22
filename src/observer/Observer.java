package observer;

public interface Observer {
    void receiveOffer(String name, Vacancy vacancy);

    String getPost();

}
