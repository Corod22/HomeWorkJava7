public class Program {


    public static void main(String[] args) {
        final Publisher jobAgency = new JobAgency();
        Company google = new Company("Google", jobAgency, 120000);
        Company yandex = new Company("Yandex", jobAgency, 95000);
        Company geekBrains = new Company("GeekBrains", jobAgency, 98000);
        Company sdek = new Company("Sdek", jobAgency, 95000);


        Student student1 = new Student("Студент #1");
        Master master1 = new Master("Мастер #1");
        Master master2 = new Master("Мастер #2");
        TruckDriver truckDriver1=new TruckDriver("truckDriver#1");
        TruckDriver truckDriver2=new TruckDriver("truckDriver#2");

        jobAgency.registerObserver(student1);
        jobAgency.registerObserver(master1);
        jobAgency.registerObserver(master2);
        jobAgency.registerObserver(truckDriver1);
        jobAgency.registerObserver(truckDriver2);

        for (int i = 0; i < 4; i++){
            google.needEmployee();
            yandex.needEmployee();
            geekBrains.needEmployee();
            sdek.needEmployee();
        }
    }

}
