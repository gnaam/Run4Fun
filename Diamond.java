import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Diamond here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Diamond extends Gain
{
    public void Diamond()
    {
        getImage().scale(10,10);
    }
    
    public void act() 
    {
        setLocation(getX(),getY()+1);
    }    
}
