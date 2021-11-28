import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import lang.stride.*;
/**
 * Write a description of class LevelSelection here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelSelection extends World
{
    private GreenfootSound bgSound;
    /**
     * Constructor for objects of class LevelSelection.
     * 
     */
    public LevelSelection()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(960, 540, 1); 
        bgSound = new GreenfootSound("CrEEP.mp3");
        prepare();
        soundStop();
    }
    /**
     * Stop sound
     */
    public void soundStop()
    {
        bgSound.stop();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Level1 level1 = new Level1();
        addObject(level1,303,99);
        level1.setLocation(343,99);
        Level2 level2 = new Level2();
        addObject(level2,121,361);
        Level3 level3 = new Level3();
        addObject(level3,745,465);
        level1.setLocation(300,113);
    }
}
