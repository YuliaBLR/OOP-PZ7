package observer;

public class Vacancy {

    private String post;

    private int salary;
    private String nameCompany;

    public Vacancy(Company company,String post) {
        this.nameCompany = company.getName();
        this.post = post;
        this.salary = company.randomSalary();
    }

    public String getPost() {
        return post;
    }

    public int getSalary() {
        return salary;
    }

    public String getNameCompany() {
        return nameCompany;
    }
}
