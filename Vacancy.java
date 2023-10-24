public class Vacancy {
    private String companyName;
    private int salary;

    public Vacancy(String companyName, int salary) {
        this.companyName = companyName;
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getSalary() {
        return salary;
    }
}