package org.example.Part1_1;

public class Main {
    public static void main(String[] args) {
        //1.1.1 instance of SubClass
        //1.1.7 call of default constructors of superClass and SubClass
        SubClass a = new SubClass();
        System.out.println();
        //1.1.2 instance of SubClass declared as SuperClass
        //1.1.7 call of non-default constructors of superClass and SubClass
        SuperClass b = new SubClass(5);
        System.out.println(b.getClass());
        System.out.println();
        //1.1.4
        b.forOverload();
        b.forOverload(5);
        a.forOverload("Rt");
        System.out.println();
        //1.1.5
        b.forOverride();
        a.forOverride();
    }
}
