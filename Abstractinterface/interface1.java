
import java.util.Scanner;


interface  Calculator
{
    void add();  // by default public and abstract (public abstract void add() -->behind the scene) 
    void sub();

}
class MyCalc1 implements  Calculator
{
public void add()
{
Scanner s=new Scanner(System.in);
System.out.println("please enter  first number to add ");
int a= s.nextInt();
System.out.println("please enter  2nd number to add ");
int b= s.nextInt();
int c=a+b;
System.out.println(c);
}
public void sub()
{
    Scanner sc=new Scanner(System.in);
System.out.println("please enter  first number to sub ");
int a= sc.nextInt();
System.out.println("please enter  2nd number to sub ");
int b= sc.nextInt();
int c=a-b;
System.out.println(c);

}
}

class  MyCalc2 implements Calculator
{
public void add()
{

int a= 10;

int b=20;
int c=a+b;
System.out.println(c);
}
public void sub()
{
int a= 30;

int b=20;
int c=a-b;
System.out.println(c);

}}
class Calu 
{
 public void permit( Calculator ref)  // we can create reference of abstract class similarly we can create reference of abstract class
{
    ref.add();
    ref.sub();
}
}



public class interface1
{
    public static void main(String[] args) {
        
      MyCalc1 m1=new MyCalc1();
      MyCalc2 m2=new MyCalc2(); 
      Calu  c1= new Calu(); 
      c1.permit(m1);
      c1.permit(m2);






    }
}