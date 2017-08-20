import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boo extends Enemy
{
    public void Boo()
    {
        getImage().scale(5,5);
    }
    public void act() 
    {
       setLocation(getX(),getY()+1);
    }    
}
