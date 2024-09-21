import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(600, 400, 1);
        elephant elephant = new elephant();
        addObject(elephant, 300, 200);
        Apple apple = new Apple();
        addObject(apple, 300, 0);
    }
}
