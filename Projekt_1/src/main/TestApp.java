package main;

public class TestApp {

    public static void main(String[] args) {

        // konstruktor "przeciazony" odwołuje się tylko do wybranych zmiennych klasy Person
        // domyślnie ZAWSZE jest konstruktor postaci Peron()
        Person person = new Person(56,"abc", "dnm");
        Person person2 = new Person();

        System.out.println(person.getAge());
        System.out.println(person2.getAge());
        // Employer = Person + 3 pola dodatkowe
        Employer employer = new Employer(4,"Dominik","Domanski","programista",34566,"dd@wp.pl");
        //staramy się elementy powtarzające się wydzielac do czesci wspolnych dla dziedziczących je klas

        person.setAge(10);
        person.setName("Kowalska");
        // tutaj odwolujemy się do wyniku getAge() ktory jest int - wiec dziedziczy toStringa z Objectu
        System.out.println(employer.getAge());
        // tutaj chcemy wydrukowac caly obiekt, wiec odwolujemy sie do jego toStringa ktory napisalismy
        // inacczej wyszlo by cos dziwnego na ekranie
        System.out.println(employer);

        // nie znajdzie, bo prywatna  --> System.out.println(persone.age);

    }


}