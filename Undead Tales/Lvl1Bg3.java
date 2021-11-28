import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lvl1Bg3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lvl1Bg3 extends Lvl1bg2
{
    /**
     * Act - do whatever the Lvl1Bg3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Set size
        GreenfootImage img = new GreenfootImage("parallax-forest-middle-trees.png");
        img.scale(500, 540);
        setImage(img);
    }
}
