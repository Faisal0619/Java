
class Telusko
{
private String name;
private int age;

    public Telusko()
     {

        System.out.println("parent class");
    }



}

class Telusko2 extends Telusko
{
public Telusko2()
{
    super(); // by default
     System.out.println("child class");
}


}

public class Paccessinheritance
{

public static void main(String[] args) {

Telusko2 obj = new Telusko2();
//obj.name="alien";

    
}

}