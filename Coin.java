import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Coin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coin extends Gain
{
    public Coin()
    {
        getImage().scale(20,30);
    }
    public void act() 
    {
       setLocation(getX()-4, getY() );
    }    
}
