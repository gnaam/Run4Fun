import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rock extends Enemy
{
    public Rock()
    {
        getImage().scale(30,30);
    }
    public void act() 
    {
       setLocation( getX()-1,getY());
    }    
}
