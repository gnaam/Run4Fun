import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cpp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cpp extends Gain
{
    GreenfootSound abstacle;
    public Cpp()
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
