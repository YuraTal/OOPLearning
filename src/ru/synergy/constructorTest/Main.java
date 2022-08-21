package ru.synergy.constructorTest;

public class Main {
//    public static final Integer MAGNIFAER = 10000;

    public static void main(String[] args) throws Exception {
   //     Person person = new Person("Sergei", 28, "Proletarskaya 10", "88005553535");
   //     Person.getCounter();
        Fraction fraction = new Fraction(1, 10);

   Person oleg = new Person("Konin","Oleg",'m');
        System.out.println(oleg);

   Employee olga = new Employee("Svetova","Olga", 'f', "Buhgalter");


        System.out.println(olga);
        olga.tellMWhoAreU();
        Person olga2 = olga;
        // Employee jleg2 = oleg; Не валидная
        System.out.println(olga2);
        ((Employee) olga2).tellMWhoAreU();
    }
}
// Old class Person
/*    class Person {
        int id;
        private String name;
        private int age;
        private static int counter = 0;

        public static int getCounter() {
            return counter;
        }

        static {
            System.out.println(counter);
        }

        public Person(String name, int age, String address, String phone) {
            id = counter++;
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            if (age>0 && age < 110)
                this.age = age;
        }
}*/

class Fraction {
    int numerator;
    int denominator = 1;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("Denominator can't be zero");
            return;
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }
}

class Person {
    protected String firstName;
    protected String lastName;
    protected char gender; // m - male, f - female

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                '}';
    }

    public Person(){
        this("", "", '-');
    }

    public Person(String lastName){
        this(lastName,"",'-');
    }


    public Person (String lastName, String firstName, char gender){
        this(lastName,firstName);
        this.gender = gender;
    }

    public Person(String lastName, String firstName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

}

class Employee extends Person{

    protected String dolznost;

    public Employee(String lastName, String firstName, char gender, String dolznost) {
        super(lastName, firstName, gender);
        this.dolznost = dolznost;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "dolznost='" + dolznost + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                '}';
    }

    public void tellMWhoAreU() {
        System.out.println("Hello, i'm employee, and my class is " + this.getClass());
    }
}