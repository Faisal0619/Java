import java.util.Scanner;
abstract class Shapes
{
float area;
abstract void input();
abstract void compute();
void display()
{
    System.out.println("The area is "+area);
}
}

class rectangle extends Shapes
{

  float l;
    float b;
     
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
}
class Square extends Shapes
{
    float l;
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
}
class Circle extends  Shapes
{

    float r;


  void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Please enter the radius of circle");
        r=sc.nextFloat();
      
    } 
    void compute()
    {
        final float pi=3.14f;
        area=pi*r*r;

      }  }

      class Geometry
      {
        void permit(Shapes s)
        {
            s.input();
            s.compute();
            s.display();
        }
      }
public class project2woop
{
 public static void main(String[] args) {
    rectangle r = new rectangle();
     Square s= new Square();
     Circle c= new Circle();
  Geometry g=new Geometry();
  g.permit(r);
  g.permit(s);
  g.permit(c);

 }
 }