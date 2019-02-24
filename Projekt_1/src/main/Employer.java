package main;

public class Employer extends Person {
    String stanowisko = "młodszy programista";
    int telefon = 12345678;
    String email = "sjjsjs@wp.pl";

    public Employer(int age, String name, String surname, String stanowisko, int telefon, String email) {
        super(age, name, surname); //odnosi się do klasy z której dziedziczysz
        super.getAge();

        this.stanowisko = stanowisko;
        this.telefon = telefon;
        this.email = email;
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
        return getName() + " " + super.getName() + getStanowisko() + getAge();
        // getAge() zwraca int, który dziedziczy po klasie Object, ktora ma swojego toStringa
    }
}
