import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
        // Add your action code here.
        
          if (Greenfoot.mouseMoved(this))
        {
             setImage("credits.png");
        }
        
          if (Greenfoot.mouseMoved(getWorld()))
        {
            setImage("creditsRED.png");
        }
        
         if (Greenfoot.mouseClicked(this))
        {

            Display display = new Display();
            getWorld().addObject(display , 280, 500);
            display.setImage(new GreenfootImage("You have selected Option 3 ", 48, Color.WHITE, Color.BLACK, Color.RED));

        }
    }
}
