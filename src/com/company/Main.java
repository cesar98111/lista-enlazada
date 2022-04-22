package com.company;

public class Main {

    public static void main(String[] args) {
        CustomCollection cola=new CustomCollection();
        System.out.println(cola);
        cola.add("hola");
        cola.add("caca");
        cola.add("tifon");
        cola.add("nicolas");
        cola.add("pepe");
        cola.insert(3,2);
        System.out.println(cola.length());

            System.out.println(cola);



    }
}
