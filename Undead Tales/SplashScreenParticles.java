import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Show particle animation in splash screen
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SplashScreenParticles extends Actor
{
    GifImage gif = new GifImage( "giphy.gif" );
    /**
     * Act - do whatever the HelpButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //to make particles animate
        setImage(gif.getCurrentImage());
        gif.getCurrentImage().scale(960, 540);
    }
}
