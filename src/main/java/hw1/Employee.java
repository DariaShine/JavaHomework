package hw1;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone, int salary, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public Employee(){
        this.name = "не определено";
        this.position = "не определена";
        this.email = "не опеределен";
        this.phone = "не опеределен";
        this.salary = 0;
        this.age = 0;
    }

    public void printInfo(){
        System.out.println("Сотрудник " + name + " , должность " + position + " e-mail: " + email + " , phone: " + phone + " , зарплата " + salary + " , возвраст " + age);
    }

    public int getAge(){
        return age;
    }

}
