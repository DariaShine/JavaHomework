package hw1;

public class Cat {
    private String name;
    private int appetite;
    private boolean isHungry;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isHungry = true;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    public void eat(Plate plate) {
        plate.decreaseFood(appetite);
        isHungry = false;
        System.out.println(name + " ate from the plate!");
    }

    public void info(){
        System.out.println("Cat " + name + " is hungry: " + isHungry);
    }
}
