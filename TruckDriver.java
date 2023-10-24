public class TruckDriver implements Observer {

    private String name;
    private int salary = 70000;

   
    public TruckDriver(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String companyName, int salary) {
        if (this.salary <= salary) {
            System.out.printf("Водитель %s: Мне нужна эта работа! (компания: %s; заработная плата: %d)\n",
                    name, companyName, salary);
            this.salary = salary;
        } else {
            System.out.printf("Водитель %s: Я найду работу получше! (компания: %s; заработная плата: %d)\n",
                    name, companyName, salary);
        }
    }

   
     @Override
    public void receiveVacancy(Vacancy vacancy) {
        System.out.println("Водитель получил вакансию: " + vacancy.getCompanyName() + " - Зарплата: " + vacancy.getSalary());
       
    }
}