import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Line7 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Line7 extends SmoothMover
{
    public Line7()
    {
        getImage().scale(80,10);
    }
    public void act() 
    {
        setLocation(getX()-1,getY());
    }      
}
