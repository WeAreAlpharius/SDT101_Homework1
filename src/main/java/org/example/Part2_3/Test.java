package org.example.Part2_3;

import org.example.Part2_3.packageSoundMakers.*;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args){
        ArrayList<SoundMaker> arr = new ArrayList<>();
        arr.add(new Dog());
        arr.add(new Frog());
        arr.add(new Cricket());
        arr.add(new Pig());
        arr.add(new Bee());

        for (SoundMaker i : arr){
            i.makeSound();
        }
    }
}
