import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import lang.stride.*;
/**
 * Write a description of class CreditsButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CreditsButton extends Actor
{
    /**
     * Act - do whatever the CreditsButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        MainMenuParticles mainMenuParticles = new MainMenuParticles();
        //To set image and play the sound effect when mouse is aimed at the image
        if (Greenfoot.mouseMoved(this))
        {   
             setImage("credits.png");
             Greenfoot.playSound("short wind sound.wav");
        }
        //To get mouse location and change the image when mouse is hovering over image
          if (Greenfoot.mouseMoved(mainMenuParticles.getImage()) || Greenfoot.mouseMoved(getWorld()))
        {
            setImage("creditsRED.png");
        }
        //To display the next screen
         if (Greenfoot.mouseClicked(this))
        {
            Display display = new Display();
            getWorld().addObject(display , 280, 500);
            display.setImage(new GreenfootImage("You have selected Option 3 ", 48, Color.WHITE, Color.BLACK, Color.RED));
            Greenfoot.playSound("hjm-glass_bell_1.wav");
        }
    }
}
