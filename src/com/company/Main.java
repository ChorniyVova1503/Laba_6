package com.company;

public class Main {
    //поля
    int f1=11110;
    private int f2=90;

    //методы
    public static void main(String[] args) {
	new fclass3().method1();
	new fclass2().test();
    }
    public int getF2(){
        return this.f2;
    }
    public void setF2(int newF2){
        this.f2=newF2;
    }
}

