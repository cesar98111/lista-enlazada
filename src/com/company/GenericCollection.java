package com.company;

public class GenericCollection <T>{
    private Object data [] = null;
    private int length = 0;

    public GenericCollection (int initialCapacity){
        data = new Object[initialCapacity];
    }
    public T getElement(int position){
        return (T)data[position];
    }
    public int length() {return length;}
    public void insert(T element, int position){
        if(length == data.length){
            Object []aux = data;
            data= new Object[data.length *2];

            for (int i = 0; i < aux.length; i++) {
                data[i] = aux[i];
            }
            aux= null; //esto es para que el recolector de basura se cargue a aux
        }
        for (int i = length -1; i>=position ;i--){
            data[i+1]= data[i];
        }
        data[position]=element;
        length++;
    }
    public void add(T element){
        insert(element,length);
    }
    public int search(T element){
        for (int i = 0; i < length; i++) {
            if(data[i].equals(element)){
                return i;
            }

        }
        return -1;
    }
    public T delete(int position){
        Object aux = data[position];

        for(int i= position; i< length -1; i++){
            data[i]=data[i+1];
        }
        data[length-1]=null;
        length--;
        return (T)aux;
    }

    @Override
    public String toString() {
        if (length==0){
            return "<Empty>";
        }
        String out="";
        for (int i = 0; i < length; i++) {
            out+=getElement(i)+",";
        }
        return out;

    }
}
