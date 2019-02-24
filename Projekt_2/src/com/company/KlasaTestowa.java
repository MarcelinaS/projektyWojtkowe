package com.company;

public class KlasaTestowa <R extends Figura> { // klasa NIE dziedziczy, tylko typ R dziedziczy po figurze

    public void generycznyWyswietlacz(R generyk, int a, int b){
        System.out.println("generyk obwod "+ generyk.obwod(a,b));
    }
}
