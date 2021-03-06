import java.util.ArrayList;
/**
 * A construction in the city of Heroes
 * 
 * @author (Nicolas Aguilera y Daniel Walteros) 
 * @version (7 of February of 2019)
 */
public class Building
{
    private int width;
    private int height;
    private int hardness;
    private int number;
    private Rectangle build;
    private ArrayList<Integer> state;
    /**
     * Constructor for objects of class Buildings
     * 
     * @param x The origin X coordinate of the building.
     * @param width The width of the building.
     * @param height The height of the building.
     * @param hardness The hardness of the building.
    */
    public Building(int number , int width , int height , int hardness)
    {
        this.width=width;
        this.height=height;
        this.hardness=hardness;
        this.number=number;
        state = new ArrayList<>();
        state.add(hardness);
        build = new Rectangle();
        build.changeSize(height,width);
    }
    /**
     * Gets the width of the building.
     * 
     * @return  The number of the width.
    */
    public int getWidth(){
        return width; 
    }
    /**
     * Gets the width of the building.
     * 
     * @return  The number of the width.
    */
    public int getHardness(){
        return hardness;
    }
    /**
     * Changes the hardness of the building.
     * 
     * @param The number of the new hardness.
     * 
     * @return The new hardness of the building.
    */
    public int setHardness(int x){
        hardness = hardness - x;
        state.add(hardness);
        return hardness;
    }
    /**
     * Gets the height of the building.
     * 
     * @return  The number of the height.
    */
    public int getHeight(){
        return height;
    }
    /**
     * Gets the X coordinate of the building.
     * 
     * @return  The number of the X coordinate.
    */
    public int getX(){
        return number;
    }
    /**
     * Knows if the building is damaged
     * 
     * @return  The boolean expression of the existence of the damage.
    */
    public boolean isDamaged(){
        return state.size()>1;
    }
    /**
     * Restore the building to the previous state after a hit.
     * 
    */
    public void restore(){
        state.remove(state.size()-1);
        hardness = state.get(state.size()-1);
    }
    /**
     * Gets the rectangle of the building.
     * 
     * @return  The number of the rectangle.
    */
    public Rectangle getBuild(){
        return build;
    }
    /**
     * Changes the size of the building.
     * 
     * @param newHeight The new height of the new hardness.
     * @param newWidth The new width of the new hardness.
    */
    public void changeSize(int newHeight , int newWidth){
        height = newHeight;
        width = newWidth;
        build.changeSize(newHeight,newWidth);
    }
}
