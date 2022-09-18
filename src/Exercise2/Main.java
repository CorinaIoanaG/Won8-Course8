package Exercise2;

import java.time.LocalDateTime;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Programmer("Dana", "Albu", new Date(1979, 6, 22),
                "Satu Mare", new Date(2022, 4, 1), "tester");
        System.out.println(String.format("%s %d years old, %s, %s", employee1.getFullName(), employee1.getAge(),
                employee1.getPosition(), employee1.getAdress()));

        Employee employee2 = new DatabaseAdmin("Andrei", "Daraban", new Date(1987, 9, 25),
                "Cluj-Napoca", new Date(2022, 7, 15), "database admin");
        ((DatabaseAdmin) employee2).dbTechnology = "SQL";
        System.out.println(String.format("%s %d years old, %s, %s", employee2.getFullName(), employee2.getAge(),
                employee2.getAdress(), ((DatabaseAdmin) employee2).dbTechnology));
    }
}
