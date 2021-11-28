import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HelpButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HelpButton extends Actor
{
    /**
     * Act - do whatever the HelpButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        MainMenuParticles mainMenuParticles = new MainMenuParticles();
        //To set image and play the sound effect when mouse is aimed at the image
         if(Greenfoot.mouseMoved(this))
        {
             setImage("help.png");
             Greenfoot.playSound("short wind sound.wav");
        }
        //To get mouse location and change the image when mouse is hovering over image
          if(Greenfoot.mouseMoved(getWorld()))
        {
            setImage("helpRED.png");
        }
        //To display the next screen
         if(Greenfoot.mouseClicked(this))
        {
            Display display = new Display();
            getWorld().addObject(display , 280, 500);
            display.setImage(new GreenfootImage("You have selected Option 2 ", 48, Color.WHITE, Color.BLACK, Color.RED));
            Greenfoot.playSound("hjm-glass_bell_1.wav");
        }
    }
}
