import java.util.ArrayList;
import java.util.List;

public class JobAgency implements Publisher {

    List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void sendOffer(final String companyName, final int salary) {
        for (Observer observer : observers) {
            observer.receiveOffer(companyName, salary);
        }
    }
    
  

    public void sendVacancy(Vacancy vacancy) {
        for (Observer observer : observers) {
            observer.receiveVacancy(vacancy);
        }
    }
}
