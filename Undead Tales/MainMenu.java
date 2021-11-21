import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMenu extends World
{

    /**
     * Constructor for objects of class MainMenu.
     * 
     */
    public MainMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(960, 540,1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        PlayButton playButton = new PlayButton();
        addObject(playButton,118,249);
        HelpButton helpButton = new HelpButton();
        addObject(helpButton,118,306);
        CreditsButton creditsButton = new CreditsButton();
        addObject(creditsButton,118,363);
    }
}
