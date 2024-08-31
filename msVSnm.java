
class Demo1{
    public static  void disp1()
    {
System.out.println("Static Method");

    }


    public void disp2()
    {
System.out.println(" Non Static Method");


    }
}
/*
Static method can be accessed or invoked using the class name directly or using the reference  also we can accees*/




public class msVSnm{

    public static void main(String[] args) {
        
         Demo1.disp1();
        Demo1 d=new Demo1();
        d.disp1();
        d.disp2();
    }
}
// inbuilt static classes methods
/*
thread.sleep(1000);
array.sort();
*/