import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class C here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class C extends Gain
{
    GreenfootSound abstacle;
    public C()
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
