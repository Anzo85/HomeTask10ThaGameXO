package org.anzo.game;

import java.util.Random;

/**
 * Created by andreyz on 25.09.16.
 */
public class Ai implements Player{

    private String name;
    private int age;
    private char type;

    public Ai(String name, int age, char type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public char getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public int moveFromPlayer(){
        Random run = new Random();
        int i = run.nextInt(3);
     return i;

    }


}
