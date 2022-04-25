package com.company;

import com.company.GenericCollection;

public class GenericQueue <T>{
    private static final int CAPACIDAD_INICIAL =5;
    private static final int TOP = 0;
    private GenericCollection<T> collection = new GenericCollection<T>(CAPACIDAD_INICIAL);

    public void enQueue(T element){
        collection.insert(element,TOP);

    }
    public T deQueue(){

        return collection.delete(collection.length()-1);

    }

}
