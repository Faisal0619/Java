
import java.util.Scanner;

class Farmer{


    private float pa;
    private float td;
    private float si;
    private  static float roi;//static variables also called as class variables
 static {
    roi=2.5f;
 }


    public void acceptInput()
    {
Scanner scan=new Scanner(System.in);
       System.out.println("Dear,kindly enter loan amount needed");
       pa=scan.nextFloat();
System.out.println("Dear,kindly enter time needed to repay");
td=scan.nextFloat();


    }
void compute()
{
    si=(pa*td*roi)/100;
}

void disp()
{
    System.out.println("Si is " + si);
}
}


public  class Farmerstatic{
    public static void main(String[] agrs)
    {
                  Farmer f1=new Farmer();
                  Farmer f2=new Farmer();


                  f1.acceptInput();
                  f1.compute();
                  f1.disp();

                 f2.acceptInput();
                  f2.compute();
                  f2.disp();

    }
}