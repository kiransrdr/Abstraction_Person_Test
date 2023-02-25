
package abstractshape_test;
public class Rectangle extends Shape{
    private int length;
    private int width;
    Rectangle(String color,int legth,int width)
    {
        super(color);
        this.length=length;
        this.width=width;
        System.out.println("2-drawing rectangle");
    }
    double getArea()
    {
        return length*width;
    }
    public String toString()
    {
        return super.toString()+" Area "+this.getArea();
    }
}
