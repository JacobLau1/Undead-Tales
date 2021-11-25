import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import lang.stride.*;
/**
 * Write a description of class MainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMenu extends World
{
    //to make a field for game sound 
    private GreenfootSound bgSound;
    
    /**
     * Constructor for objects of class MainMenu.
     * 
     */
    public MainMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(960, 540,1); 
        bgSound = new GreenfootSound("CrEEP.mp3");
        prepare();
        soundStart();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        //To place user button choices location on the screen
        PlayButton playButton = new PlayButton();
        addObject(playButton,118,249);
        HelpButton helpButton = new HelpButton();
        addObject(helpButton,118,306);
        CreditsButton creditsButton = new CreditsButton();
        addObject(creditsButton,118,363);
    }
     /**
     * To start the Sound
     */
    public void soundStart()
    {
        //Loop sound CrEEP.mp3
        bgSound.playLoop();
    }
}
