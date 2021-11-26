import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainMenuParticles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMenuParticles extends Actor
{
    GifImage gif = new GifImage( "giphy2.1.gif" );
    /**
     * Act - do whatever the HelpButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //make the particles animate
        setImage(gif.getCurrentImage());
        gif.getCurrentImage().scale(760, 540);
    }
}
