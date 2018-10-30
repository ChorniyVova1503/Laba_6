package com.company;

public class fclass2 extends fclass3 {
    public void method1(){
        System.out.println("Значение закрытого поля суперкласса="+getF2());
    }
    public void test(){
        method1();
        setF2(800);
        System.out.println("Новое , измененное значение закрытого поля класса Main");
        method1();
    }
}
