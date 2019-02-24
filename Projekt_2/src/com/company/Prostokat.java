package com.company;

public class Prostokat extends Figura {
    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public double pole(int a, int b) {
        return a * b;
    }

    public double obwod(int a, int b) {
        return 2 *(a + b);
    }
}
