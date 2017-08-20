import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Coin1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coin1 extends Gain
{
    public Coin1()
    {
        getImage().scale(20,20);
        
    }
    public void act() 
    {
        move(1);
        if( isAtEdge() || getX()>=990)
            turn(Greenfoot.getRandomNumber(200)+10);
            
    }      
}
