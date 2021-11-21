import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SplashScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SplashScreen extends World
{

    double timeSplashScreenCreation = System.currentTimeMillis();        
    
    /**
     * Constructor for objects of class SplashScreen.
     * 
     */
    public SplashScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(960, 540, 1); 
        showText("Press space bar or wait 10 seconds", getWidth()/2, 40);
    }
    
    public void act()
    {
         Display display = new Display();
        addObject(display , 860, 40);
        
        int timerValue = (int) (System.currentTimeMillis() - timeSplashScreenCreation)/1000;
        
        display.setImage(new GreenfootImage("Seconds passed: " + timerValue , 26, Color.WHITE, Color.BLACK, Color.WHITE));
        
        if (Greenfoot.isKeyDown("space"))
        {
            Greenfoot.setWorld(new MainMenu());
        }
        
        if (System.currentTimeMillis() >= (timeSplashScreenCreation + (10 * 1000)))
        {
            Greenfoot.setWorld(new MainMenu());
        }
    }
}
