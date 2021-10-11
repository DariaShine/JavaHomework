package hw1;

import javax.swing.*;
import java.util.Arrays;

public class HomeWorkApp {

    public static void main(String[] args) {

        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Иванов Иван Иванович", "Директор", "ivanov@gmail.com", "89500483925", 100000, 45);
        employeeArray[1] = new Employee("Петров Пётр Петрович", "Начальник отдела", "petrov@gmail.com", "89500894783", 70000, 30);
        employeeArray[2] = new Employee("Фёдоров Фёдор Фёдорович", "Менеджер", "fedorov@gmail.com", "89500845783", 50000, 30);
        employeeArray[3] = new Employee("Кузьмина Елена Ивановна", "Секретарь", "kuzmina@gmail.com", "89504567709", 30000, 25);
        employeeArray[4] = new Employee("Кириллова Мария Ильинична", "Уборщица", "kirillova@gmail.com", "89046549874", 20000, 50);

        for (int i = 0; i < employeeArray.length; i++) {
            if(employeeArray[i].getAge() >= 40) {
                employeeArray[i].printInfo();
            }
        }
    }
}




