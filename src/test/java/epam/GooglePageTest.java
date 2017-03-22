package epam;

import epam.page.GooglePage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class GooglePageTest {
   private GooglePage googlePage;

    @Test
    public void setUp () {
        googlePage = new GooglePage();
        Thread t1 = new Thread (googlePage);
        Thread t2 = new Thread (googlePage);
        Thread t3 = new Thread (googlePage);
        t1.start();
        t2.start();
        t3.start();
    }
}
