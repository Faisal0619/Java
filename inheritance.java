
 class Acalc{
       

       public int Add(int a,int b)   // parent,super,base
       {
        return a+b;
       }
    

    //    public void show()
    //    {

    //    }
}
 class Pcalc extends  Acalc
{                 
      public int sub(int a,int b)   // child class,sub,derived
       {
        return a-b;
       }
}

// multilevel inheritance
class fcalc extends Pcalc
{
         public int mul(int a,int b)
       {
        return a*b;
       }
}


public class inheritance
{

    public static void main(String[] args) {
        //hey java,i want an object
        //hey Alien ,give me a Design and i will give you an object
        // class
         fcalc obj1=new fcalc();
        int result= obj1.Add(10, 12);
         System.out.println(result);
         int result1= obj1.sub(10, 12);
          System.out.println(result1);
            int result2= obj1.mul(10, 12);
               System.out.println(result2);
    }
}