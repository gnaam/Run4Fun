import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cam1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cam1 extends SmoothMover
{
    /**
     * Act - do whatever the Cam1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       setLocation( getExactX()-1,getExactY() );
    }    
}
