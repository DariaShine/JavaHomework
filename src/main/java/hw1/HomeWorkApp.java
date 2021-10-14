package hw1;

import javax.swing.*;
import java.util.Arrays;

public class HomeWorkApp {

    public static void main(String[] args) {

        Animal cat = new Cat("Finik", 200);
        Animal dog = new Dog("Sharik", 500);

        cat.run();
        dog.run();

        cat.swim();
        dog.dist = 10;
        dog.swim();
    }
}




