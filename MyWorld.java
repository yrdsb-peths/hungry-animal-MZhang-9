import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MyWorld extends World
{

    public int score = 0;
    Label scoreLabel;
    public MyWorld()
    {    
        super(600, 400, 1);
        elephant elephant = new elephant();
        addObject(elephant, 300, 200);
        
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        createApple();
        
    }
    public void increaseScore(){
        score++;
        scoreLabel.setValue(score);
    }
    public void createApple(){
        Apple apple = new Apple();
        int x = Greenfoot.getRandomNumber(600);
        addObject(apple, x, 0);
        
    }
}

