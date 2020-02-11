package model;

import util.Printer;
import util.UserInputs;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

public class UserInputsTest {

    Printer printer = new Printer();

    UserInputs userInputs = new UserInputs();
    Book bk = new Book();

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



    @Test

    public void shouldShowMenuOptions(){

        printer.printOptions();

        assertThat(outContent.toString(), containsString("1 - List books"));


    }

    @Test
    public void shouldSelectCorrectOption() throws IOException {

        userInputs.chooseOption(1);

        assertThat(outContent.toString(), containsString("Author"));


    }

    @Test
    public void shouldShowMessageWhenChooseInvalidOption() throws IOException {

        userInputs.chooseOption(8);

        assertThat(outContent.toString(), containsString("Select a valid option!"));

    }


    @Test
    public void shouldQuitApplicationWhenChooseZero() throws IOException {

       userInputs.chooseOption(0);

        System.exit(0);

    }




    @Test
    public void login() throws IOException {

        userInputs.login();

        assertThat(outContent.toString(), containsString("Hello, you are logged in!"));



    }
}