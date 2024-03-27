import java.awt.*;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {



        Manager manager1= new Manager("Петров", "Петр", "89003332211",200, LocalDate.of(1980, 12,23), "Руководитель");
        Employee [] employees = {
                new Manager("Васильева", "Юлия","89237485",300,LocalDate.of(1992,11,22),"Руководитель отдела 1"),
                new Manager("Соколов", "Алексей","894534651",300,LocalDate.of(1986,3, 30),"Руководитель отдела 2"),
                new Worker("Воробьев","Александр", "896573458",200, LocalDate.of(1985,11,25),"Менеджер"),
                new Worker("Башкевич","Анастасия", "89783448698",150, LocalDate.of(1988,5,22),"Менеджер по работе с клиентами1"),
                new Worker("Васильев","Кирилл", "894763486890",150, LocalDate.of(1995,6,18),"Менеджер по работе с клиентами2"),
                new Worker("Никифорова","Анна", "894763486890",150, LocalDate.of(1988,7,14),"Менеджер по работе с клиентами3")
        };



        Manager.assign(employees,"Васильев", "Кирилл","Выполни задачу");
        Arrays.asList(employees).forEach(System.out::println);
        System.out.println();

        Task.assign(employees,"Воробьев", "Александр", Level.Medium, "Сдай отчет");
        Arrays.asList(employees).forEach(System.out::println);

    }
}