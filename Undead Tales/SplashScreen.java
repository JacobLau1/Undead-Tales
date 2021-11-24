import lang.stride.*;
import greenfoot.*;
/**
 * Write a description of class SplashScreen here.
 * @author (your name) @version (a version number or a date)
 */
public class SplashScreen extends World
{
    //to make a field for sound and splashScreen
    private GreenfootSound bgSound;
    protected double timeSplashScreenCreation = System.currentTimeMillis();

    /**
     * Constructor for objects of class SplashScreen.
     */
    public SplashScreen()
    {
        super(960, 540, 1);
        /* Create a new world with 600x400 cells with a cell size of 1x1 pixels.*/
        showText("Press space bar or wait 10 seconds", getWidth() / 2, 40);
        bgSound =  new  GreenfootSound("Intro.mp3");
    }

    /**
     * To play sound and move screen depending on user method chosen
     */
    public void act()
    {
        //Display dimensions
        Display display =  new  Display();
        addObject(display, 860, 40);
        // To display the seconds in timer and get seconds count
        int timerValue = (int)(System.currentTimeMillis() - timeSplashScreenCreation) / 1000;
        display.setImage( new  GreenfootImage("Seconds passed: " + timerValue, 26, Color.WHITE, Color.BLACK, Color.WHITE));
        soundStart();
        // To move to the next screen method 1
        if (Greenfoot.isKeyDown("space")) {
            Greenfoot.setWorld( new  MainMenu());
            soundStop();
        }
        // To move to the next screen method 2
        if (System.currentTimeMillis() >= (timeSplashScreenCreation + (10 * 1000))) {
            Greenfoot.setWorld( new  MainMenu());
            soundStop();
        }
    }
    /**
     * To start the Sound
     */
    public void soundStart()
    {
        //Loop sound Intro.mp3
        bgSound.playLoop();
    }
    /**
     * To stop the sound after it moves to the main screen
     */
    public void soundStop()
    {
        //Stop looped sound Intro.mp3
        bgSound.stop();
    }
}
