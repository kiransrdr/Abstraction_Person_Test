 
package abstractshape_test;
 
abstract class Shape{
    private String color;
    Shape(String color)
    {
        this.color=color;
        System.out.println("1-drawing Shape");
    }
    abstract double getArea();
    public String toString()
    {
        return "Color "+this.color;
    }
}
