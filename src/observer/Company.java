package observer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class Company {

    private Random random = new Random();
    private String name;
    private Publisher jobAgency;
    private int maxSalary;
    private Collection<Vacancy> vacancies = new ArrayList<>();

    public Company(String name, Publisher jobAgency, int maxSalary){
        this.jobAgency = jobAgency;
        this.name = name;
        this.maxSalary = maxSalary;
    }

    public void registerVacancies(Vacancy vacancy) {
        if(vacancy.getNameCompany().equals(this.name))
            vacancies.add(vacancy);
        else{
            throw new RuntimeException("Вакансия не принадлежит данной компании");
        }
    }

    public int randomSalary(){
        return random.nextInt(maxSalary);
    }

    public void needEmployee(){
        jobAgency.sendOffer(name, vacancies);
    }

    public String getName() {
        return name;
    }

    public Publisher getJobAgency() {
        return jobAgency;
    }

    public int getMaxSalary() {
        return maxSalary;
    }


}
