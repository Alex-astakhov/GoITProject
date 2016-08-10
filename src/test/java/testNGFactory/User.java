package testNGFactory;

import javax.swing.plaf.PanelUI;

/**
 * Created by Alex Astakhov on 28.07.2016.
 */
public class User {
    public String name;
    public int age;
    public char gender;

    public User(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


}
