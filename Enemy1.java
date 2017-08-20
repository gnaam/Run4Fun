import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy1 extends Enemy
{
    public Enemy1()
    {
        getImage().scale(30,30);
    }
    public void act() 
    {
        move(4);
        if( isAtEdge() )
            turn(Greenfoot.getRandomNumber(270)+20);
        if( getOneIntersectingObject(Sam.class)!=null )
            Greenfoot.stop();
    }    
}
