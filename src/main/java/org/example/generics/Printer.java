package org.example.generics;

public class Printer<T> {
    private T myVariable;

    public Printer(T myVariable){
        this.myVariable = myVariable;
    }

    public void print (){
        System.out.println(myVariable);
    }
}
