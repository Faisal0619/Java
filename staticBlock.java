class Alien{
    private int age;
     private String name;

    static  int count;
//non static block

{
    count++;
}

    Alien()
    {
//count++;
    }
    Alien(int age)
    {
        //count++;
        this.age=age;
    }
    Alien(int age,String name)
    {
       // count++;
   this.age=age;
   this.name=name;

    }
}


public class staticBlock{

    public static void main(String[] args) {


        Alien a1=new Alien();
         Alien a2=new Alien(28);
          Alien a3=new Alien(28,"rahul");

          System.out.println(Alien.count);

        
    }
}