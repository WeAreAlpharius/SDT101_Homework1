package org.example.Part1_1;

//1.1.1 Inheritance
public class SubClass extends SuperClass{

    SubClass(){
        System.out.println("default subClass");
    }
    SubClass(int x){
        //1.1.7 constructor from SuperClass
        super(x);
    }

    public void fun(){
        //1.1.3 accessing variables from super class
        prot = 5;
        pub = 5;
        //privat = 5; //error. cant access private variable
    }
    //1.1.4
    public void forOverload(String str){
        System.out.println("SuperClass" + str);
    }
    //1.1.5
    @Override
    public void forOverride() {
        System.out.println("SubClass");
        //1.1.6
        super.forOverride();
    }
}
