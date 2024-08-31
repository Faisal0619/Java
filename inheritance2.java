class x
{
    int i=3;

}


class a   extends x     // super
 {
//  int i=5;
public void show()
{
    System.out.println("In a show ");
}


}

class b extends  a   // sub class
{

int i=7;
void printvalue(){
    int i=9;
    System.out.println(i);
    System.out.println("hey java ,this is the varaible of b class "+ this.i);
    System.out.println(super.i);
    //System.out.println(super.super.i);  can't do this

}

}

public class inheritance2{

    public static void main(String[] args) {
          
          b obj=new b();
            obj.show();
            // System.out.println(obj.i);
            obj.printvalue();
    }
}