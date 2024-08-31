

class animal
 {
    public void eat()
    {
        System.out.println("eating");
    }
    public void sleep()
    {
        System.out.println("sleeping");
    }
 }
 class tiger extends animal{
 public void eat()
    {
        System.out.println(" tiger is eating");
    }
    public void sleep()
    {
        System.out.println(" tiger is sleeping");
    }

 }
  class monkey extends animal{
 public void eat()
    {
        System.out.println(" monkey is eating");
    }
    public void sleep()
    {
        System.out.println(" monkey is sleeping");
    }

 }
 class dear extends animal{
 public void eat()
    {
        System.out.println(" dear is eating");
    }
    public void sleep()
    {
        System.out.println(" dear is sleeping");
    }

 }

class forest
{
    public void allow(animal a)
    {
        a.eat();
        a.sleep();
    }
}


public class polyanimal
{
    public static void main(String[] args) {
        tiger t=new tiger();
        monkey m=new monkey();
         dear d= new dear();
          
          forest f =new forest();
          f.allow(t);
          f.allow(m);
          f.allow(d);



    }
}