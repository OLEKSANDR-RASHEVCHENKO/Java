package Overloading;

public class OverloadingKonstructor {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    OverloadingKonstructor(int id1, String surname1, int age1) {
        this(id1, surname1, age1,0.0,null);// Вызываю с третьего конструктора
    }

    OverloadingKonstructor(String surname2, int age2) {
        this(0, surname2, age2,0.0,null);// Вызываю с третьего конструктора
    }

    OverloadingKonstructor(int id3, String surname3, int age3, double salary3, String department3) {
        id = id3;
        surname = surname3;
        age = age3;
        salary = salary3;
        department = department3;

    }


}

class OverloadingKonstructorMethod {
    public static void main(String[] args) {
        OverloadingKonstructor emp1 = new OverloadingKonstructor(2, "Olek", 29);
        System.out.println(emp1.surname);
        OverloadingKonstructor emp2 = new OverloadingKonstructor("Kowalski", 25);
        System.out.println(emp2.surname);
        OverloadingKonstructor emp3 = new OverloadingKonstructor(1, "Nowak", 30, 1000.00, "IT");
        System.out.println(emp3.surname);

    }
}
