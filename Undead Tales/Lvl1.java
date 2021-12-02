import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lvl1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lvl1 extends World
{

    GreenfootImage back1 = new GreenfootImage("forest1.png");
    GreenfootImage back2 = new GreenfootImage("forest2.png");

    /**
     * Constructor for objects of class Lvl1.
     * 
     */
    public Lvl1()
    {    
        // size 
        super(960, 540, 1); 

        setBackground(back2);

    }

    public void act()
    {
        // run act
        showText("Run Act", 250, 250);
        
        if (Greenfoot.isKeyDown("space"))
        {
            showText("space pressed", 350, 350);
            if (getBackground() == back1)
            {
                 showText("Test conditio is met", 250, 250);
                setBackground(back2);                   
               
            }
            else
            setBackground(back1);  
        }
    }
}
