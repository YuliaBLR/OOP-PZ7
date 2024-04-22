package observer;

public class Student implements Observer{
    private String name;
    private int salary;

    public Student(String name){
        this.name = name;
        salary = 5000;
    }
    public boolean atWork;


    @Override
    public void receiveOffer(String name, Vacancy vacancy) {
        if (this.salary <= vacancy.getSalary()){
            System.out.printf("Студент %s: Мне нужна эта работа! (компания: %s; должность: %s; заработная плата: %d)\n",
                    this.name, name, vacancy.getPost(), vacancy.getSalary() );
            this.salary = vacancy.getSalary();
        }
        else {
            System.out.printf("Студент %s: Я найду работу получше! (компания: %s; должность: %s; заработная плата: %d)\n",
                    this.name, name, vacancy.getPost(), vacancy.getSalary());
        }
    }

    @Override
    public String getPost() {
        return "Любая должность";
    }


}
