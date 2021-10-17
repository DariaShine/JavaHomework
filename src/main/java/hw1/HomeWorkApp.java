package hw1;

import java.util.Scanner;

public class HomeWorkApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cat[] cats = {
                new Cat("Finik", 10),
                new Cat("Persik", 15),
                new Cat("Fantik", 5)
        };

        Plate plate = new Plate(25);
        plate.info();

        for (Cat cat : cats) {
            cat.info();
            if(!plate.isEnought()){
                System.out.println("There is no enought food in the plate! Input amount of food!");
                int n = sc.nextInt();
                plate.addFood(n);
                plate.info();
            }
            cat.eat(plate);
            cat.info();
            plate.info();
        }
    }
}

