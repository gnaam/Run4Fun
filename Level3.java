import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Level3 extends MyWorld
{
    private int level2Counter;
    private int x1;
    private int x2;
    private int x3;
    //privat
    Diamond diamond = new Diamond();
    Diamond1 diamond1 = new Diamond1();
    Boo boo = new Boo();
    //Boo boo1 = new Boo();
    //Boo boo2 = new Boo();
    //Bomb bomb = new Bomb();
    
    public Level3()
    {
        level2Counter=1;
    }
    public void act()
    {
        super.act();
        if( level2Counter%400==0 )
            addObject(boo,x3=30+Greenfoot.getRandomNumber(900),20);
        if(level2Counter%500==0)
            addObject(diamond,x1=30+Greenfoot.getRandomNumber(900),20);
        if(level2Counter%1900==0)
            addObject(diamond,x2=30+Greenfoot.getRandomNumber(900),20);
         
        
        if( !(getObjectsAt(x3,581,Boo.class).isEmpty()) )
            removeObject( getObjects(Boo.class).get(0) );
            
        if( !(getObjectsAt(x1,581,Diamond.class).isEmpty()) )
            removeObject( getObjects(Diamond.class).get(0) );   
        if( !(getObjectsAt(x2,581,Diamond1.class).isEmpty()) )
            removeObject( getObjects(Diamond1.class).get(0) );
        level2Counter++;
        
        
    }
    //@override
    public void nextLevel()
    {
            Greenfoot.setWorld(new Level4());
    }
}
