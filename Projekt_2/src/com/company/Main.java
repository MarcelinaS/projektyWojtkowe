package com.company;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        Figura kwadratunio = new Kwadrat(); //używam domyślnego konstruktora klasy Kwadrat
        Figura prostokacik = new Prostokat(); //używam domyślnego konstruktora klasy Prostokacik

        List listaProbna = new ArrayList();
        listaProbna.add(kwadratunio);
        listaProbna.add(kwadratunio.pole(4,0));
        listaProbna.add(kwadratunio.obwod(3,0));
        listaProbna.add(prostokacik);
        listaProbna.add(prostokacik.pole(7,8));
        listaProbna.add(prostokacik.obwod(3,2));
// 24.02
        List<Figura> listaProbna2 = new ArrayList<>();
        listaProbna2.add(kwadratunio);
        listaProbna2.add(prostokacik);

        for (Figura x : listaProbna2  //widzi na x metody klasy abstrakcyjnej
        ) {
            System.out.println(x.pole(2,3));
        }


        System.out.println("Pole kwadratunia z listy: "+ listaProbna.get(1));
        System.out.println("Obwod kwadratunia z listy: "+ listaProbna.get(2));
        System.out.println("Pole prostokacika z listy: "+ listaProbna.get(4));
        System.out.println("Obwod prostokacika z listy: "+ listaProbna.get(5));

        //   System.out.println("pole kwadratunia : " + kwadratunio.pole(5,0));
        //   System.out.println("pole prostokacika : " + prostokacik.pole(3,5));
    }
}
