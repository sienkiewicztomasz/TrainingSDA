package JUnit5;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.LinkedList;


public class MokitoExamplesTest {

    @Test
    void firstTest() {
        LinkedList mockedList = Mockito.mock(LinkedList.class);
        //stubbing
        Mockito.when(mockedList.get(0)).thenReturn("first");
        Mockito.when(mockedList.get(1)).thenThrow(new RuntimeException());
        //following prints "first"
        System.out.println(mockedList.get(0));
        //following throws runtime exception
        System.out.println(mockedList.get(1));
    }

    @Test
    void testPersonMock() {

        Person personMock = Mockito.mock(Person.class);

        Mockito.when(personMock.getFirstname()).thenReturn("Jan");
        Mockito.when(personMock.getLastName()).thenReturn("Nowak");

        System.out.println(personMock.getFirstname());
        System.out.println(personMock.getLastName());
    }
}
