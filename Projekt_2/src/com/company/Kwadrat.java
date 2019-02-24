package com.company;

public class Kwadrat extends Figura {
    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public double pole(int a, int b) {
        try {
            if (a == 0) throw new IllegalArgumentException();
            return Math.pow(a, 2);
        } catch (Exception e) {   //przechwytuje błąd lokalnie
            System.out.println("blad przechwyczony z kwadratu");
            return 0;
        }

    }
        public double obwod ( int a, int b){
            return 4 * a;
        }

}
