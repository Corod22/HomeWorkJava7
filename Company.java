import java.util.Random;

public class Company {

    private Random random = new Random();

    private String name;

    private Publisher jobAgency;

    private int maxSalary;

    /**
     * @param name
     * @param jobAgency
     * @param maxSalary
     */
    public Company(String name, Publisher jobAgency, int maxSalary) {
        this.name = name;
        this.jobAgency = jobAgency;
        this.maxSalary = maxSalary;
    }

    public void needEmployee() {
        int salary = random.nextInt(maxSalary);
        Vacancy vacancy = new Vacancy(name, salary);
        jobAgency.sendVacancy(vacancy);
    }

}
