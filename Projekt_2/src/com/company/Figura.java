package com.company;

public abstract class Figura {
    private int a;
    private int b;

    public double pole (int a, int b){  //jako, ze kl. abstrakcyjna, to mozna dodac cialo metody (w interfejsie nie)
        return a * 50 * b;
    };

    public abstract double obwod (int a, int b);
}
