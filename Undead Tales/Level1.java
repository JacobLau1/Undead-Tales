import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import lang.stride.*;
/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends Actor
{
    /**
     * Act - do whatever the Level1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // set image 
        if(Greenfoot.mouseMoved(this))
        {

        }
        // get mouse coordinates and change to original image 
        if(Greenfoot.mouseMoved(getWorld()))
        {

        }
        // change world
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Lvl1());
        }
    }
}
