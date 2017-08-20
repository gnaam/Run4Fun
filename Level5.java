import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level5 extends World
{

    Score scoreObj=null;
    
    public Level5()
    {    
        super(1200, 600, 1);
        addObject( new Coin1(),Greenfoot.getRandomNumber(965)+20,Greenfoot.getRandomNumber(560)+20 );
        addObject( new Coin1(),Greenfoot.getRandomNumber(965)+20,Greenfoot.getRandomNumber(560)+20 );
        addObject( new Coin1(),Greenfoot.getRandomNumber(965)+20,Greenfoot.getRandomNumber(560)+20 );
        addObject( new Coin1(),Greenfoot.getRandomNumber(965)+20,Greenfoot.getRandomNumber(560)+20 );
        addObject( new Coin1(),Greenfoot.getRandomNumber(965)+20,Greenfoot.getRandomNumber(560)+20 );
        addObject( new Coin1(),Greenfoot.getRandomNumber(965)+20,Greenfoot.getRandomNumber(560)+20 );
        addObject( new Fire(), Greenfoot.getRandomNumber(965)+20,Greenfoot.getRandomNumber(560)+20 );
        scoreObj = new Score();
        addObject( scoreObj, 1100,300);
        
        addObject( new Ram(),200,200);
    }
}
