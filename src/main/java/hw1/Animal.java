package hw1;

public class Animal {
    protected String name;
    protected int dist;

    public void run(){
        System.out.println(name + " пробежал " + dist + " м");
    }

    public void swim(){
        System.out.println(name + " проплыл " + dist + " м");
    }
}
