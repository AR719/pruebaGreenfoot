import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * MyCat is your own cat. Get it to do things by writing code in its act method.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyCat extends Cat
{
    /**
     * Act - do whatever the MyCat wants to do.
     */
    public void act(){
    sleep(2); //durmamos un poquito
        if(isSleepy() == true){
        sleep(5);
    } else{
        wait(1);
    }
    if(isBored() == true){
        dance();
    }
    if(isHungry() == true){
        eat();
    }
    if(isSleepy()== true){
        sleep(3);
        shoutHooray();
    }else{
        shoutHooray();
    }
    if(hasCompany() == true){
        sleep(3);
    }else{
        shoutHooray();
    }
    
        
    eat();
    dance();
    sleep(6);
        
    walkRight(-6);
    walkLeft(3);
    wait(2);
    shoutHooray();
    }    
}
