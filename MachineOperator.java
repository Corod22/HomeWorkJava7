public class MachineOperator implements Observer {

    private String name;
    private int salary = 50000;

   
    public MachineOperator(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String companyName, int salary) {
        if (this.salary <= salary) {
            System.out.printf("Машинист %s: Мне нужна эта работа! (компания: %s; заработная плата: %d)\n",
                    name, companyName, salary);
            this.salary = salary;
        } else {
            System.out.printf("Машинист %s: Я найду работу получше! (компания: %s; заработная плата: %d)\n",
                    name, companyName, salary);
        }
    }

   
     @Override
    public void receiveVacancy(Vacancy vacancy) {
        System.out.println("Машинист получил вакансию: " + vacancy.getCompanyName() + " - Зарплата: " + vacancy.getSalary());
       
    }
}