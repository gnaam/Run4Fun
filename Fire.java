import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fire extends SmoothMover
{
    public Fire()
    {
    }
    public void act() 
    {
       move(2);
       turnTowards( getWorld().getObjects(Ram.class).get(0).getX(), getWorld().getObjects(Ram.class).get(0).getY());
    }    
}
