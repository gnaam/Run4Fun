import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sam here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sam extends SmoothMover
{
    private int xPosition;
    private int yPosition;
    //private int increPos=10;
    public boolean isOrgPlace=false;
    public int ySpeed;
    public boolean enable=true;
    public int coinCount=0;
    
    private GreenfootImage[] images1, images2;
    private int currentImage = 1;
    private int noOfImages;
    //private int ySpeed;
    private int imageChanger = 1;
    
    GreenfootSound startT;
    GreenfootSound abstacle;
    GreenfootSound coin;
    
    public Sam()
    {
        startT = new GreenfootSound("ShantyTownRidingthe Tempest.mp3");
        abstacle = new GreenfootSound("bomb.wav");
        coin = new GreenfootSound("coincollect.wav");
        
        noOfImages = 10;
        images1 = new GreenfootImage[noOfImages];
        images2 = new GreenfootImage[noOfImages];
        
        for(int i=0; i < noOfImages; i++) {
            images1[i] = new GreenfootImage("run" + (i+1) + ".png");
        }
        for(int i=0; i < noOfImages; i++) {
            images2[i] = new GreenfootImage("brun" + (i+1) + ".png");
        }
        setImage(images2[currentImage]);
    }
    public void act() 
    {
        
        startT.playLoop();
        
        if( getOneIntersectingObject(Coin1.class)!=null )
        {
            coin.play();
            coinCount++;
            removeTouching(Coin1.class);
        }
        if( coinCount>=6 )
        {
            startT.stop();
        }
        if( getOneIntersectingObject(Java.class)!=null )
        {
            gameOver();
            startT.stop();
            Greenfoot.stop();
            //Greenfoot.setWorld(new Level4());
        }
        if( getOneIntersectingObject(C.class)!=null )
        {
            gameOver();
            startT.stop();
            //Greenfoot.setWorld(new Level4());
            Greenfoot.stop();
        }
        if( getOneIntersectingObject(Cpp.class)!=null )
        {
            gameOver();
            startT.stop();
            //Greenfoot.setWorld(new Level4());
            Greenfoot.stop();
        }
        if( getOneIntersectingObject(PHP.class)!=null )
        {
            gameOver();
            startT.stop();
            //Greenfoot.setWorld(new Level4());
            Greenfoot.stop();
        }
        if( getOneIntersectingObject(Python.class)!=null )
        {
            gameOver();
            startT.stop();
            delay();
            //Greenfoot.setWorld(new Level4());
            Greenfoot.stop();
        }
        run();    
        enable();
        jump();
        checkBoundary();
    }
    public void run()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            imageChanger++;
            if(imageChanger == 3){
                currentImage = (currentImage + 1)%10;
                setImage(images1[currentImage]);
                imageChanger = 0;
                if(currentImage>9)
                    currentImage = 0;
            }
            move(-4);
            
        }
        if( Greenfoot.isKeyDown("right") )
        {
   
            imageChanger++;
            if(imageChanger == 3){
                currentImage = (currentImage + 1)%10;
                setImage(images2[currentImage]);
                imageChanger = 0;
                if(currentImage>9)
                    currentImage = 0;
            }
            move(4);
        }
        if( Greenfoot.isKeyDown("up") )
        {
            setLocation(getX(),getY()-4);
            /*
            setRotation(270);
            imageChanger++;
            if(imageChanger == 3){
                currentImage = (currentImage + 1)%10;
                setImage(images2[currentImage]);
                imageChanger = 0;
                if(currentImage>9)
                    currentImage = 0;
            }
            move(4);
            setRotation(0); */
        }
        if( Greenfoot.isKeyDown("down") )
        {
            setLocation(getX(),getY()+4);
            /*
            setRotation(90);
            imageChanger++;
            if(imageChanger == 3){
                currentImage = (currentImage + 1)%10;
                setImage(images1[currentImage]);
                imageChanger = 0;
                if(currentImage>9)
                    currentImage = 0;
            }
            move(4); */
        }
       
    }
    public void checkBoundary()
    {
        if( getX()<0 )
            setLocation(getX()+5,getY());
        if( getX()>995 )
            setLocation(getX()-5,getY());
    }
    public void gameOver()
    {
        GameOver gameOver = new GameOver();
        getWorld().addObject( gameOver, getWorld().getWidth()/2,getWorld().getHeight()/2);
    }
    public void delay()
    {
        Greenfoot.delay(50);
    }
    public void enable()
    {
        if( enable )
        {
            setYPosition(getY());
            enable=false;
        }
    }
    
    public void jump()
    {
        int originalPlace=getYPosition();
        if( getY()==originalPlace )
        {
            isOrgPlace = true;
        }
        if (!isOrgPlace)
        {
            ySpeed++;
            setLocation(getX(), getY()+ySpeed);
            if (getY()>=originalPlace)
            {
                setLocation(getX(), originalPlace);
                Greenfoot.getKey();
                enable=true;
           }
        }
        else
        {
            if ("space".equals(Greenfoot.getKey()))
            {
                ySpeed = -20;
                setLocation(getX(), getY()+ySpeed);
            }
        }
        isOrgPlace=false;
    }
    public void setXPosition(int x)
    {
        xPosition=x;
    }
    
    public void setYPosition(int y)
    {
        yPosition=y;
    }
    
    public int getXPosition()
    {
        return xPosition;
    }
    
    public int getYPosition()
    {
        return yPosition;
    }
    public void up()
    {
        setRotation(270);
    }
    public void down()
    {
        setRotation(90);
    }
}
