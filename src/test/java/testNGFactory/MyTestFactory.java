package testNGFactory;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;

/**
 * Created by Alex Astakhov on 28.07.2016.
 */
public class MyTestFactory {

    @Factory(dataProvider = "dp1")
    public Object[] createInstance(User user){
        return new Object[] {new MyTest(user)};
    }

    @DataProvider(parallel = false)
    public Object[][] dp1(){
        return new Object[][]{
                {new User("Jack", 25, 'm')},
                {new User("Mary", 20, 'w')},
                {new User("Tom", 35, 'm')},
                {new User("Bob", 11, 'm')},
        };

    }
}
