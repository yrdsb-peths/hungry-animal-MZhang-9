import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class elephant here.
 * 
 * @author Mason
 * @version sep 21 2024
 */
public class elephant extends Actor
{
    GreenfootSound elephantSound = new GreenfootSound("elephantcub.mp3");
    GreenfootImage idle = new GreenfootImage("
    public void act()
    {
        if(Greenfoot.isKeyDown("left")){
            move(-5);
        }
        else if(Greenfoot.isKeyDown("right")){
            move(5);
        }
        eat(); 
    }
    public void eat(){
        if(isTouching(Apple.class)){
            removeTouching(Apple.class);
            MyWorld world = (MyWorld) getWorld();
            world.createApple();
            world.increaseScore();
            elephantSound.play();
        }
    }
}
