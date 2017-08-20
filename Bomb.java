import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomb extends Enemy
{
    public Bomb()
    {
        getImage().scale(25,25);
    }
    public void act() 
    {
        setLocation( getX()-2,getY() );
    }    
}
