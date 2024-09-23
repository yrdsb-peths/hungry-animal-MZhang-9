import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class TitleScreen extends World
{

    Label titleLabel = new Label("Hungry Elephant", 60);
    public TitleScreen()
    {    

        super(600, 400, 1); 
        addObject(titleLabel, getWidth()/2, 200);
        prepare();
    }

    public void act(){
        if(Greenfoot.isKeyDown("space")){
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Label label = new Label("press *space* to start", 60);
        addObject(label,288,271);
        elephant elephant = new elephant();
        addObject(elephant,549,195);
        elephant elephant2 = new elephant();
        addObject(elephant2,46,196);
        Apple apple = new Apple();
        addObject(apple,155,328);
        Apple apple2 = new Apple();
        addObject(apple2,291,334);
        removeObject(apple2);
        Apple apple3 = new Apple();
        addObject(apple3,271,328);
        Apple apple4 = new Apple();
        addObject(apple4,382,329);
        elephant2.setLocation(49,96);
        elephant.setLocation(567,95);
        label.setLocation(321,225);
        apple3.setLocation(411,330);
        apple2.setLocation(285,332);
        apple.setLocation(175,332);
        apple3.setLocation(309,342);
        apple4.setLocation(312,335);
        label.setLocation(385,263);
        apple3.setLocation(414,353);
        label.setLocation(363,271);
        apple3.setLocation(438,346);
        elephant.setLocation(564,179);
        elephant2.setLocation(51,184);
        label.setLocation(300,300);
        apple4.setLocation(318,344);
        apple.setLocation(180,355);
        apple4.setLocation(303,353);
        apple3.setLocation(430,365);
        apple3.setLocation(435,349);
        removeObject(apple);
        removeObject(apple4);
        removeObject(apple3);
    }
}
