package costumer;

import model.Book;
import model.Costumer;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class CostumerTest {

    @Test
    public void shouldCreateMovie(){



        Costumer costumer = new Costumer("Flavia", "123-1234", "banana");

        assertEquals(costumer.getName(), "Flavia");
    }

}