package testNGFactory;

import org.testng.annotations.Test;

/**
 * Created by Alex Astakhov on 28.07.2016.
 */
public class MyTest {

    public MyTest(User user){
        this.user = user;
    }
    User user;

    @Test
    public void validateNameField(){
        System.out.println(user.name);
    }

    @Test
    public void validateAgeField(){
        System.out.println(user.age);
    }

    @Test
    public void validateGenderField(){
        System.out.println(user.gender);
    }
}
