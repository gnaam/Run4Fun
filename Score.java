import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Score extends Actor
{
    
    public int score=0;
    GreenfootImage title;
    GreenfootImage scoreBack;
    GreenfootImage num;
    public Score()
    {
        title = new GreenfootImage(250,60);
        title.setColor(Color.BLUE);
        title.setFont(title.getFont().deriveFont(30f));
        String ttl = new String("Run4Fun");
        title.drawString(ttl,35,30);
        scoreBack = new GreenfootImage(200,600);
        scoreBack.setColor( Color.PINK );
        scoreBack.fill();
        scoreBack.drawImage(title,1,30);
        setImage(scoreBack);
    }
    public void act() 
    {
       //System.out.println( man.passScore );
    }
    
    /*
    public void setScore(int s)
    {
        scoreBack.clear();
        title = new GreenfootImage(200,60);
        title.setColor(Color.WHITE);
        title.fill();
        title.setColor(Color.BLUE);
        String ttl = new String("Run4Fun");
        title.drawString(ttl,50,30);
        
        num = new GreenfootImage(100,30);
        //num.setColor(Color.WHITE);
        //num.fillRect(10,10,100,30);
        num.setColor(Color.BLUE);
        num.drawString("Score:"+s,10,10);

        scoreBack = new GreenfootImage(200,600);
        scoreBack.setColor( Color.PINK );
        scoreBack.fill();
        scoreBack.drawImage(title,20,30);
        scoreBack.drawImage(num,20,120);
        setImage(scoreBack);
    } */
}
