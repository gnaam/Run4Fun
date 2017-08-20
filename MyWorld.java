import greenfoot.*;


public class MyWorld extends World
{
    
    public int addObjectTime=0;
    Score scoreObj=null;
    Coin coin;
    Bomb bomb;
    Rock rock;
    Rock2 rock2;
    
    Sarkar sarkar;
    
    Car1 car1;
    Car2 car2;

    Cam1 cam1;
    Cam2 cam2;
    Cam3 cam3;
    Cam4 cam4;
    Cam5 cam5;
    Cam6 cam6;
    Cam7 cam7;
    Cam8 cam8;
    
    Line1 line1;
    Line2 line2;
    Line3 line3;
    Line4 line4;
    Line5 line5;
    Line6 line6;
    Line7 line7;
    Line8 line8;
    Line9 line9;
    Line10 line10;
    
    public MyWorld()
    {    
        super(1200, 600, 1,false);
        setPaintOrder( GameOver.class,Score.class,Sarkar.class,Boo.class,Diamond.class,Diamond1.class,Line1.class,Line2.class,Line3.class,Line4.class,Line5.class,Line6.class,Line7.class,Line8.class,Line9.class,Line10.class,Bomb.class,Coin.class,Rock.class,Rock2.class,Car1.class,Car2.class,Road.class);
        intializeObjects();
        addObject(sarkar, 21,512);
        initializeLines();
        addLines();
        addObject( new Road(), 297,516);
        addObject( new Road(), 307,572);        
        addObject( new Road(), 943,516);
        addObject( new Road(), 917,572);
        addObject( cam1,165,330);
        addObject( cam2,442,357);
        addObject( cam3,715,354);
        addObject( cam4, 1050,320);
        scoreObj = new Score();
        addObject( scoreObj,1100,300);
  
    }
    public void initializeLines()
    {
        line1 = new Line1();
        line2 = new Line2();
        line3 = new Line3();
        line4 = new Line4();
        line5 = new Line5();
        line6 = new Line6();
        line7 = new Line7();
        line8 = new Line8();
        line9 = new Line9();
        line10 = new Line10();
        
    }
    public void addLines()
    {
        addObject(line1,100,531);
        addObject(line2,300,531);
        addObject(line3,500,531);
        addObject(line4,700,531);
        addObject(line5,900,531);
    }
    
    public void intializeObjects()
    {
        cam1 = new Cam1();
        cam2 = new Cam2();
        cam3 = new Cam3();
        cam4 = new Cam4();
        cam5 = new Cam5();
        cam6 = new Cam6();
        cam7 = new Cam7();
        cam8 = new Cam8();
        
        coin = new Coin();
        bomb = new Bomb();
        rock = new Rock();
        rock2 = new Rock2();
    
        sarkar = new Sarkar();
        car1 = new Car1();
        car2 = new Car2();
        
        
    }
    public void addDesCampus()
    {
        if( !(getObjectsAt(-310,330,Cam1.class).isEmpty()) )
        {
            removeObject(cam1);
            addObject(cam5,1086,305);
        }
        if( !(getObjectsAt(-260,357,Cam2.class).isEmpty()) )
        {
            removeObject(cam2);
            addObject(cam6,1077,298);
        }
        if( !(getObjectsAt(-330,354,Cam3.class).isEmpty()) )
        {
            removeObject(cam3);
            addObject(cam7,1070,234);
        }
        if( !(getObjectsAt(-315,320,Cam4.class).isEmpty()) )
        {
            removeObject(cam4);
            addObject(cam8,1055,233);
        }
        if( !(getObjectsAt(-265,305,Cam5.class).isEmpty()) )
        {
            removeObject(cam5);
            addObject(cam1,1120,327);
        }
        if( !(getObjectsAt(-295,298,Cam6.class).isEmpty()) )
        {
            removeObject(cam6);
            addObject(cam2,1100,354);
        }
        if( !(getObjectsAt(-280,234,Cam7.class).isEmpty()) )
        {
            removeObject(cam7);
            addObject(cam3,1077,351);
        }
        if( !(getObjectsAt(-300,233,Cam8.class).isEmpty()) )
        {
            removeObject(cam8);
            addObject(cam4,1077,317);
        }
    }
    public void addDesCoin()
    {
        if( addObjectTime%200 == 0 )
        {
            addObject(coin, 500+Greenfoot.getRandomNumber(600),500 );
        }
        
        if( !(getObjectsAt(100,500,Coin.class).isEmpty()) )
        {
            removeObject(coin);
        }
    }
    public void addDesBomb()
    {
        if( addObjectTime%300 == 0)
        {
            addObject(bomb, 700+Greenfoot.getRandomNumber(400),500);
        }
        
        if( !(getObjectsAt(100,500,Bomb.class).isEmpty()) )
        {
            removeObject(bomb);
        }
    }
    public void addDesRock()
    {
        if( addObjectTime%400 == 0)
        {
            addObject( rock, 900+Greenfoot.getRandomNumber(300), 500);
        }
        if( addObjectTime%500 == 0 )
        {
            addObject( rock2,1000+Greenfoot.getRandomNumber(100),500);
        }
        
        if( !(getObjectsAt(100,500,Rock2.class).isEmpty()) )
        {
            removeObject(rock2);
        }
        if( !(getObjectsAt(100,500,Rock.class).isEmpty()) )
        {
            removeObject(rock);
        }
    }
    public void addDesCar()
    {
        if( addObjectTime%200 == 0 )
        {
            addObject( car1,900,572 );
        }
        if( addObjectTime%450 == 0 )
        {
            addObject( car2,1000,572 );
        }
        
        if( !(getObjectsAt(-1,572,Car1.class).isEmpty()) )
        {
            removeObject(car1);
        }
        if( !(getObjectsAt(-1,572,Car2.class).isEmpty()) )
        {
            removeObject(car2);
        }
    }
        
    public void nextLevel()
    {
            Greenfoot.setWorld(new Level3());
    }
    public void addDesLines()
    {
       if( !(getObjectsAt(0,531,Line1.class).isEmpty()) )
        {
            removeObject(line1);
            addObject(line6,1027,531);
        }
        if( !(getObjectsAt(0,531,Line2.class).isEmpty()) )
        {
            removeObject(line2);
            addObject(line7,1027,531);
        }
        if( !(getObjectsAt(0,531,Line3.class).isEmpty()) )
        {
            removeObject(line3);
            addObject(line8,1027,531);
        }
        if( !(getObjectsAt(0,531,Line4.class).isEmpty()) )
        {
            removeObject(line4);
            addObject(line9,1027,531);
        }
        if( !(getObjectsAt(0,531,Line5.class).isEmpty()) )
        {
            removeObject(line5);
            addObject(line10,1027,531);
        }
        if( !(getObjectsAt(0,531,Line6.class).isEmpty()) )
        {
            removeObject(line6);
            addObject(line1,1027,531);
        }
        if( !(getObjectsAt(0,531,Line7.class).isEmpty()) )
        {
            removeObject(line7);
            addObject(line2,1027,531);
        }
        if( !(getObjectsAt(0,531,Line8.class).isEmpty()) )
        {
            removeObject(line8);
            addObject(line3,1027,531);
        }
        if( !(getObjectsAt(0,531,Line9.class).isEmpty()) )
        {
            removeObject(line9);
            addObject(line4,1027,531);
        }
        if( !(getObjectsAt(0,531,Line10.class).isEmpty()) )
        {
            removeObject(line10);
            addObject(line5,1027,531);
        } 
    }
    public void act()
    {
        
        //scoreObj.setScore(addObjectTime);
        addDesCampus();
        addDesCoin();
        addDesBomb();
        addDesRock();
        addDesCar();
       
        if( !getObjects(LevelComplete.class).isEmpty() )
        {
            nextLevel();
        }
        
        
        addObjectTime++;
        addDesLines();
    }
}
