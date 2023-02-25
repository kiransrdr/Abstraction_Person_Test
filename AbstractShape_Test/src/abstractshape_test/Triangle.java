 
package abstractshape_test;
 
public class Triangle extends Shape{
    private int base;
    private int height;
    Triangle(String color,int base,int height)
    {
        super(color);
        this.base=base;
        this.height=height;
        System.out.println("3-drawing Triangle");
    }
    double getArea()
    {
        return .5*base*height;
    }
    public String toString()
    {
        return super.toString()+" Area "+this.getArea();
    }
}
