package GettingJump;
import Figuras.*;
import java.math.BigDecimal;
import java.util.ArrayList;
/**
 * A building that cant be damaged by a crush, it can be identified by his red window.
 *
 * @author (Nicolas Aguilera y Daniel Walteros)
 * @version (24 of March of 2019)
 */
public class HardBuilding extends Building{
    private Rectangle window;
    private Rectangle frame;
    /**
     * Constructor for objects of class RadicalBuilding
     */
     public HardBuilding(CityOfHeroes city , int x , int width , int height , int hardness){
        super(city, x, width, height, hardness);
        setHardness(100);
        window=new Rectangle();
        frame=new Rectangle();
        window.changeColor("red");
        frame.changeColor("black");
        window.changeSize(24,(width/3)-4);
        frame.changeSize(31,width/3);
    }
    /**
     * Knows if the building was damaged by a hero.
     * 
     * @param  hero The hero that crash with the building.
     * @param  jump The boolean value that determines if the hero are jumping. 
     * @param  tempY The Y coordinate in the hero smash the building.
     * @param  actaulY The Y coordinate of the hero.
    */
     protected boolean isDamagedByHero(Hero hero , boolean jump , BigDecimal tempY , BigDecimal actualY){
       int strength = hero.getStrength();
       if(Math.abs(tempY.subtract(actualY).doubleValue())>(actualY.doubleValue()*1)/100){
           hero.setStrength(-1);
       }
       return false;
    }
    /**
     * Updates the size of the building when gets damaged.
     * 
     * @param  jump The boolean value that determines if the hero are jumping. 
     * @param  cityHeight The height of the city.
     * @param  y The Y coordinate in the hero smash the building.
    */
    protected void updateSize(boolean jump , int cityHeight , int y){
        return;
    }
    /**
     * Moves the building in the city.
     * 
     * @param x The X coordinate in the city.
     * @param y The Y coordinate in the city.
    */
    public void goTo(int x , int y){
        super.goTo(x,y);
        window.goTo(x+(getWidth()/3)+2,y+getHeight()-57);
        frame.goTo(x+getWidth()/3,y+getHeight()-60);
    }
    /**
     * Makes visible the building.
     * 
    */
    public void makeVisible(){
        super.makeVisible();
        frame.makeVisible();
        window.makeVisible();
    }
    /**
     * Makes invisible the building.
     * 
    */
    public void makeInvisible(){
        super.makeInvisible();
        window.makeInvisible();
        frame.makeInvisible();
    }
    /**
     * Changes the size of the building.
     * 
     * @param newHeight The new height of the new hardness.
     * @param newWidth The new width of the new hardness.
    */
    public void changeSize(int newHeight , int newWidth){
        super.changeSize(newHeight, newWidth);
        window.changeSize((newHeight/4)-6,(newWidth/8)-4);
        frame.changeSize(newHeight/4,newWidth/8);
    }
}
