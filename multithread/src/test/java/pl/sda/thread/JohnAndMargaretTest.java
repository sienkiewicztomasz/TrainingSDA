package pl.sda.thread;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import pl.sda.thread.JohnAndMargaret;

import java.io.PrintStream;

public class JohnAndMargaretTest {


    @Test
    public void shouldDoTasks() throws Exception {

        PrintStream ps = Mockito.mock(PrintStream.class);
        System.setOut(ps);

        JohnAndMargaret.main(null);
        Mockito.verify(ps).println("Koniec dnia");


    }
}
