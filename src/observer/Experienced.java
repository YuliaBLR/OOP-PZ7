package observer;

public class Experienced implements Observer{

    private String name;
    private int salary;
    private String post;
    public Experienced(String name, String post){
        this.post = post;
        this.name = name;
        salary = 100000;
    }
    @Override
    public void receiveOffer(String name, Vacancy vacancy) {
        if (this.salary <= vacancy.getSalary() & this.post.equals(vacancy.getPost())){
            System.out.printf("Опытный специалист %s: Мне нужна эта работа! (компания: %s; должность: %s; заработная плата: %d)\n",
                    this.name, name, vacancy.getPost(),vacancy.getSalary());
            this.salary = vacancy.getSalary();
        }
        else {
            System.out.printf("Опытный специалист %s: Я найду работу получше! (компания: %s; должность: %s; заработная плата: %d)\n",
                    this.name,  name, vacancy.getPost(), vacancy.getSalary());
        }
    }

    public String getPost() {
        return post;
    }
}
