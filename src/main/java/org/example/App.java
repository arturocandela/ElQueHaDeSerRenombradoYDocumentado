package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Door door = new Door("The last door of the Seven Kingdoms");
        Hodor hodor = new Hodor();
        hodor.holdTheDoor(door);

    }
}
