package hw1;

public class Cat extends Animal {
    public Cat (String name, int dist){
        this.name = name;
        this.dist = dist;
    }

    @Override
    public void swim(){
        System.out.println(name + " не умеет плавать");
    }
}
