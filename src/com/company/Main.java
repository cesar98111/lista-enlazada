package com.company;

public class Main {

    public static void main(String[] args) {
       /* GenericCollection cola=new GenericCollection<String>(5);
        System.out.println(cola);
        cola.add("hola");
        cola.add("caca");
        cola.add("tifon");
        cola.add("nicolas");
        cola.add("pepe");
        cola.insert(3,2);
        System.out.println(cola.Length());

            System.out.println(cola);
*/
        GenericStack<String> miPila = new GenericStack<String>();

        miPila.push("el quijote");
        miPila.push("el pricipe de la niebla");
        miPila.push("cisne negro");

        System.out.println(miPila.pop());




    }
}
