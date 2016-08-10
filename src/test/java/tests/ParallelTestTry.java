package tests;

import core.BrowserFactory;
import org.testng.annotations.Test;

/**
 * Created by Alex Astakhov on 25.07.2016.
 */
public class ParallelTestTry extends BrowserFactory{

    @Test
    public void test() throws InterruptedException {
        driver().get("http://google.com");
        Thread.sleep(5000);
    }
}