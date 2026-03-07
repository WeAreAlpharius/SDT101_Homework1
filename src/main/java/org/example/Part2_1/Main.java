package org.example.Part2_1;

public class Main {

    public static void main(String[] args) {
        SuperClass a = new SubClass();
        a.theMethod();
        //there would be called method of SubClass
    }
}
