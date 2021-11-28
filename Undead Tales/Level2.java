import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import lang.stride.*;
/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends Actor
{
    /**
     * Act - do whatever the Level2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // set image 
        if(Greenfoot.mouseMoved(this))
        {
             setImage("lvl 2 H.png");
        }
        // get mouse coordinates and change to original image 
        if(Greenfoot.mouseMoved(getWorld()))
        {
               setImage("lvl 2.png");
        }
        // change worlds
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Lvl2());
        }
    }
}
