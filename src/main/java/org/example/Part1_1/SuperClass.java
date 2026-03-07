package org.example.Part1_1;

public class SuperClass extends MyAbstractClass{

    SuperClass(){
        System.out.println("default super constructor");
    }
    SuperClass(int x){
        System.out.println("Super constructor"+ x);
    }

    //1.1.3 variables with different access modifiers
    private int privat;
    public int pub;
    protected int prot;

    //1.1.4
    public void forOverload(){
        System.out.println("SuperClass");
    }
    //1.1.4
    public void forOverload(int x){
        System.out.println("SuperClass" + x);
    }
    //1.1.5
    public void forOverride(){
        System.out.println("SuperClass");
    }

    //1.1.8
    @Override
    public void abstractFun(){

    }
}
