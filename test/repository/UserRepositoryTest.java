package repository;

import org.junit.After;
import org.junit.Before;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class UserRepositoryTest {

    UserRepository userRepository = new UserRepository();

    private PrintStream sysOut;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        sysOut = System.out;
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void revertStreams() {
        System.setOut(sysOut);
    }





}