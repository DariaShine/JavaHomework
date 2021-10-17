package hw1;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        food -= n;
        if(food < 0){
            System.out.println("There is no enought food in the plate!");
        }
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public boolean isEnought(){
        if(food <= 0){
            return false;
        }
        return true;
    }

    public void addFood(int n){
        food += n;
        System.out.println(n + " was added in the plate!");
    }


}
