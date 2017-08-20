import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Level4 extends World
{

    public int sc=0;
    public int noOfObj=13;
    Score scoreObj = null;

    
    public Level4()
    {    
        super(1200, 600, 1);
        setPaintOrder(Sam.class);
        setActOrder(Cpp.class,C.class,Python.class,PHP.class,Java.class,Coin.class);
        addObject( new Cpp(),Greenfoot.getRandomNumber(965)+20,Greenfoot.getRandomNumber(500)+20);
        addObject( new C(),Greenfoot.getRandomNumber(965)+20,Greenfoot.getRandomNumber(500)+20);
        addObject( new Python(),Greenfoot.getRandomNumber(965)+20,Greenfoot.getRandomNumber(500)+20);
        addObject( new PHP(),Greenfoot.getRandomNumber(965)+20,Greenfoot.getRandomNumber(500)+20);
        addObject( new Java(),Greenfoot.getRandomNumber(965)+20,Greenfoot.getRandomNumber(500)+20);
        
        addObject( new Coin1(),Greenfoot.getRandomNumber(965)+20,Greenfoot.getRandomNumber(560)+20 );
        addObject( new Coin1(),Greenfoot.getRandomNumber(965)+20,Greenfoot.getRandomNumber(560)+20 );
        addObject( new Coin1(),Greenfoot.getRandomNumber(965)+20,Greenfoot.getRandomNumber(560)+20 );
        addObject( new Coin1(),Greenfoot.getRandomNumber(965)+20,Greenfoot.getRandomNumber(560)+20 );
        addObject( new Coin1(),Greenfoot.getRandomNumber(965)+20,Greenfoot.getRandomNumber(560)+20 );
        addObject( new Coin1(),Greenfoot.getRandomNumber(965)+20,Greenfoot.getRandomNumber(560)+20 );
        scoreObj = new Score();
        addObject(scoreObj, 1100,300);
        addObject( new Sam(),600,570);
    }
    public void act()
    {
        
        if( numberOfObjects()<=7 )
        {
            addObject( new LevelComplete(), getWidth()/2,getHeight()/2 );
            //Greenfoot.stop(); //levelComplete
            nextLevel();
        }
        if( noOfObj!=numberOfObjects() )
        {   
            sc+=200;
            //scoreObj.setScore(sc);
            noOfObj--;
        }
    }
    public void nextLevel()
    {
        Greenfoot.setWorld(new Level5());
    }
}
