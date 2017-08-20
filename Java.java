import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Java here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Java extends Gain
{
    GreenfootSound abstacle;
    public Java()
    {
        getImage().scale(30,30);
        abstacle = new GreenfootSound("bomb.wav");
    }
    public void act() 
    {
        move(4);
        if( isAtEdge() || getX()>=980)
            turn(Greenfoot.getRandomNumber(270)+20);
    }     
}
