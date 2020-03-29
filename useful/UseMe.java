package useful;
public class UseMe
{
    double base,height;
    public UseMe(double base, double height)
    {
        this.base=base;
        this.height=height;
    }
    public void display()
    {
        System.out.println(base+" "+height);
    }
    public void area(double base, double height)
    {
        System.out.println("Area of triangle: "+ (0.5*base*height));
    }
}
