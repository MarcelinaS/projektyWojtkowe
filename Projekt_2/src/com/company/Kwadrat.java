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
    public double pole(int a, int b){
        return Math.pow(a,2);
    }

    public double obwod(int a,int b){
        return 4 * a;
    }


}
