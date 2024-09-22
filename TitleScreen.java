import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class TitleScreen extends World
{

    Label titleLabel = new Label("Hungry Elephant", 60);
    public TitleScreen()
    {    
        
        super(600, 400, 1); 
        addObject(titleLabel, getWidth()/2, getHeight()/2);
    }
    public void act(){
        if(Greenfoot.isKeyDown("space")){
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
}
