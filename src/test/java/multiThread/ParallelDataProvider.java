package multiThread;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Alex Astakhov on 28.07.2016.
 */
public class ParallelDataProvider {

    @DataProvider(parallel = true)
    public Object[][] obj1() {
        return new Object[][]{
                {1},
                {2},
                {3}
        };
    }

    @Test(dataProvider = "obj1")
    public void test1(int i) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println(i);
    }


}
