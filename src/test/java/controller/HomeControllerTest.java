package controller;


import model.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import service.HomeService;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@DisplayName("when controller is requested")
public class HomeControllerTest {

    @Mock
    HomeService homeService;

    @InjectMocks
    HomeController homeController;

    @Test
    @DisplayName("to get person by id")
    public void testGetById(){
        when(homeService.getById("1")).thenReturn(new Person("1", "John"));
        Person person = homeController.getPersonById("1");
        assertNotNull(person, ()-> "Person should not be null");
        assertEquals("John", person.getName(), ()-> "Name should be John");
    }

    @Test
    @DisplayName("get null if id do not exist")
    public void testIfPersonDoesNotExistOnGetById(){
        when(homeService.getById("1")).thenReturn(null);
        Person person = homeController.getPersonById("1");
        assertNull(person);
    }

}
