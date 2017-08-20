import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Line6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Line6 extends SmoothMover
{
    public Line6()
    {
        getImage().scale(80,10);
    }
    public void act() 
    {
        setLocation(getX()-1,getY());
    }     
}
