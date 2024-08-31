
import java.util.Scanner;

class Rectangle
{
    float l;
    float b;
    float area;
     
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Please enter the length and breadth of rectangle");
        l=sc.nextFloat();
        b=sc.nextFloat();
    } 
    void compute()
    {
        area=l*b;
    }
    void display()
    {
        System.err.println("Area of rect is "+area);
    }
}
class Square
{
    float l;
    float area;
  void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Please enter the length of square");
        l=sc.nextFloat();
     
    } 
    void compute()
    {
        area=l*l;
    }
    void display()
    {
        System.err.println("Area of Square is "+area);
    }
}
class Circle
{
    final float  pi=3.14f;
    float r;
    float area;


  void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Please enter the radius of circle");
        r=sc.nextFloat();
      
    } 
    void compute()
    {
        area=pi*r*r;
    }
    void display()
    {
        System.err.println("Area of circle is "+area);
    }
}


public class project1woutoop
{
 public static void main(String[] args) {
     Rectangle r = new Rectangle();
     Square s= new Square();
     Circle c= new Circle();

     r.input();
     r.compute();
     r.display();

      s.input();
     s.compute();
     s.display();

      c.input();
     c.compute();
     c.display();

 }
}