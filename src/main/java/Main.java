import controller.HomeController;
import model.Person;
import service.HomeService;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        List<Person> persons = new ArrayList<>();
//        persons.add(new Person("1", "John"));
//        persons.add(new Person("2", "Jane"));

        HomeService homeService = new HomeService();
        HomeController homeController = new HomeController(homeService);

    }
}
