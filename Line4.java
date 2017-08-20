import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Line4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Line4 extends SmoothMover
{
    public Line4()
    {
        getImage().scale(80,10);
    }
    public void act() 
    {
        setLocation(getX()-1,getY());
    }     
}
