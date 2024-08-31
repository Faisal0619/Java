

import java.util.*;

class democircle 
{
    public static void main(String[] args) {
        circle c=new circle();
        c.input();
        c.area();
        c.circum();
    }
}
class circle {
private float radius;
private float area;
private float circumferance;
final float x;


public circle()
{
    x=3.14f;
}
public void input()
{
    Scanner sc=new Scanner(System.in);
    radius=sc.nextFloat();
    sc.close();

}
public void area()
{
    area=3.14f*radius*radius;
    System.out.println("area is " + area);
}
public void circum()
{
    circumferance=2*3.14f*radius;
    System.out.println("circumference is " + circumferance);
}
}