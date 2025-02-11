package controller;

import model.Person;
import service.HomeService;

import java.util.List;

public class HomeController {

    private HomeService homeService;

    public HomeController(HomeService homeService) {
        this.homeService = homeService;
    }

    public List<Person> getAllPersons() {
      return  homeService.getAll();
    }

    public Person getPersonById(String  id) {
        return homeService.getById(id);
    }
}
