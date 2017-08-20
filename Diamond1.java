import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Diamond1 here.
 * 
 * @author (nam) 
 * @version (a version number or a date)
 */
public class Diamond1 extends Gain
{
    public Diamond1()
    {
        getImage().scale(20,20);
    }
    public void act() 
    {
        setLocation(getX(),getY()+2);
    }    
}
