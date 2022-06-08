package org.example;

public class Hodor {

    int doorsHolding = 0;

    public Hodor(){
        System.out.println("I'm Hodor. I exist in the past and in the future at the same time");
    }


    public void holdTheDoor(Door door) {
        if ( doorsHolding+1 == 1 ){
            System.out.println("Holding the: "+door);
            doorsHolding++;
        } else {
            System.out.println("I cannot hold more than 1 door (even if the door is the same)");
        }


    }
}
