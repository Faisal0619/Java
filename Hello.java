
import java.util.Scanner;



/**
 * Hello
 */
public class Hello {
    public static void main(String[] args) 
{

            /* int num=257;
             byte num1=(byte)num;
            // int result= num+num1;
            System.out.println(num1);
*/

            Scanner s = new Scanner(System.in); 
                 System.out.println("Enter the value of x and y coordinate");
                  int x =s.nextInt();
                  int y=s.nextInt();
                    if(x > 0 && y >0)
                    {
                        System.out.println("value lies in 2nd quadrant");
                    }
                    else if(x>0 && y<0 )
                    {
                        System.out.println("value lies in 4th quadrant");
                    }
                      else if(x<0 && y<0 )
                    {
                        System.out.println("value lies in 3rd quadrant");
                    }
                      else if(x<0 && y>0 )
                    {
                        System.out.println("value lies in ist quadrant");
                    }
                      else if(x!=0 && y==0 )
                    {
                        System.out.println("value lies on x axis");
                    }
                    else if (x==0 && y!=0) {
                        System.out.println("value lies on y axis");
                    }
               s.close();
}

   
}