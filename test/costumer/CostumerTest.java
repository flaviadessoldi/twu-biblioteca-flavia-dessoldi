package costumer;

import model.Costumer;
import org.junit.Test;

import static org.junit.Assert.*;

public class CostumerTest {

    @Test
    public void shouldCreateMovie(){



        Costumer costumer = new Costumer("Flavia", "123-1234", "banana", "flavia@email.com", "555-1234");

        assertEquals(costumer.getName(), "Flavia");
    }

}