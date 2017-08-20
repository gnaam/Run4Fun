import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Sarkar extends SmoothMover
{
    public boolean onGround=true;
    private int ySpeed;
    public boolean death=false;
    public int level=0;
    
    //private int counter=0;
    public int s=0;
    //Score score = new Score();
    
    private GreenfootImage[] images1, images2;
    private int currentImage = 1;
    private int noOfImages;
    //private int ySpeed;
    private int imageChanger = 1;
    private boolean right=true;
    private boolean left=false;
    
    GreenfootSound rockT = new GreenfootSound("rock.wav");
    GreenfootSound rockT2 = new GreenfootSound("rock2.wav");
    GreenfootSound coinT = new GreenfootSound("coin.wav");
    GreenfootSound bombT = new GreenfootSound("bomb.wav");
    GreenfootSound startT = new GreenfootSound("ChasingSecrets.mp3");
    
    
    public Sarkar()
    {
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
        //getWorld().addObject(score,1100,300);
        startT.playLoop();
        
        //ends
            
            if( getOneIntersectingObject(Coin.class)!=null )
            {
                s+=20;
                //score.setScore(s);
                coinT.play();
                removeTouching(Coin.class);
            } 
            
            if( getOneIntersectingObject(Bomb.class)!=null )
            {
                bombT.play();
                setRotation(-90);
                setLocation( getX(),getY()+100);
                death=true;
                removeTouching( Bomb.class );
            
            }
       
            if(  (getOneIntersectingObject(Rock.class)!=null) || (getOneIntersectingObject(Rock2.class)!=null) )
            {
                rockT.play();
                s--;
                //score.setScore(s);
                
            }
            
            if( getOneIntersectingObject(Diamond.class)!=null )
            {
                s+=100;
                //score.setScore(s);
                removeTouching( Diamond.class );
            }
        
            if( s>=100 )
            {
                startT.stop();
                levelComplete();
                //getWorld().addObject(new Girl(),200,200);
                //if( getWorld().get
            }
            if( death )
            {
                gameOver();
                startT.stop();
            }
        
            run();
            jump();
            checkBoundary();
        //}
        
        
        
        
    }
    public void run()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            left=true;
            right=false;
            move(-4);
        }
        if( left )
        {
            
            imageChanger++;
            if(imageChanger == 2){
                currentImage = (currentImage + 1)%10;
                setImage(images1[currentImage]);
                imageChanger = 0;
                if(currentImage>9)
                    currentImage = 0;
            }
            right=false;
            
        }
        if( Greenfoot.isKeyDown("right") )
        {
            right=true;
            left=false;
            move(4);
        }
        
        if( right )
        {
            imageChanger++;
            if(imageChanger == 2){
                currentImage = (currentImage + 1)%10;
                setImage(images2[currentImage]);
                imageChanger = 0;
                if(currentImage>9)
                    currentImage = 0;
            }
        }
       
    }
    public void checkBoundary()
    {
        if( getX()<0 )
            setLocation(getX()+5,getY());
        if( getX()>995 )
            setLocation(getX()-5,getY());
    }
        
    
    
    public void jump()
    {
        int groundLevel = (getWorld().getHeight() - getImage().getHeight()/2)-60;
        //System.out.println(groundLevel);
        
        
        if( getY()==groundLevel )
        {
            onGround = true;
        }
        if (!onGround)
        {
            ySpeed++;
            setLocation(getX(), getY()+ySpeed);
            if (getY()>=groundLevel)
            {
                setLocation(getX(), groundLevel);
                Greenfoot.getKey();
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
        onGround=false;
    }
    
    public void gameOver()
    {
        GameOver gameOver = new GameOver();
        getWorld().addObject( gameOver,getWorld().getWidth()/2,getWorld().getHeight()/2);
        Greenfoot.stop();
    }
    
    public void levelComplete()
    {
        LevelComplete levelC = new LevelComplete();
        getWorld().addObject( new LevelComplete(),getWorld().getWidth()/2,getWorld().getHeight()/2);
        Greenfoot.delay(60);
    }
    /*
    public void up()
    {
        setRotation(270);
    }
    public void down()
    {
        setRotation(90);
    }
    public void left()
    {
        setRotation(180);
    }
    public void right()
    {
        setRotation(0);
    } */
        
}
