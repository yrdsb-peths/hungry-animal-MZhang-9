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
    GreenfootImage[] idle = new GreenfootImage[8];
    
    public elephant()
    {
        for(int i = 0; i < idle.length; i++){
            idle[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
            idle[i].scale(75, 75);
        }
        setImage(idle[0]);
    }
    
    int imageIndex = 0;
    public void animateElephant(){
        setImage(idle[imageIndex]);
        imageIndex = (imageIndex + 1) % idle.length;
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("left")){
            move(-5);
        }
        else if(Greenfoot.isKeyDown("right")){
            move(5);
        }
        eat(); 
        animateElephant();
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
