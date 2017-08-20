import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rock2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rock2 extends Enemy
{
    public Rock2()
    {
        getImage().scale(30,30);
    }
    public void act() 
    {
       setLocation(getX()-5,getY());
    }    
}
