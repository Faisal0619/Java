
public class launchStatic2
{
//static varaibles
static int a,b,c;

//static block
static 
{
 System.out.println("static block");
a=10;
b=20;
c=30;
}
static void disp(){
System.out.println("static  method");
System.out.println(a);
System.out.println(b);
System.out.println(c);
}

int m,n,o;
//java block /initialization block/instance initialization block/non static block
{
System.out.println("Non static block");
m=100;
n=200;
o=300;
a=40;
b=50;
c=60;

}
void disp1(){
    System.out.println("non static method");
    System.out.println(m);
     System.out.println(n);
      System.out.println(o);
       System.out.println(a);
        System.out.println(b);
         System.out.println(c);
}
public static void main(String[] args) {
     System.out.println("main method");
     disp();
     launchStatic2 s1=new launchStatic2();
     s1.disp1();
}
}