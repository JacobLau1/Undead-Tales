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
        // Add your action code here.
        
         if (Greenfoot.mouseMoved(this))
        {
             setImage("help.png");
        }
        
          if (Greenfoot.mouseMoved(getWorld()))
        {
            setImage("helpRED.png");
        }
        
         if (Greenfoot.mouseClicked(this))
        {

            Display display = new Display();
            getWorld().addObject(display , 280, 500);
            display.setImage(new GreenfootImage("You have selected Option 2 ", 48, Color.WHITE, Color.BLACK, Color.RED));

        }
    }
}
