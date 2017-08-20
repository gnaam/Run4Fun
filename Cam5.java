import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cam5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cam5 extends SmoothMover
{
    /**
     * Act - do whatever the Cam5 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       setLocation( getExactX()-1,getExactY() );
    }    
}
