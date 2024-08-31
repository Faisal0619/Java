class animal 
{

}
class tiger extends animal{

}


class plane{
    protected animal fly()
    {
        System.out.println("plane is flying");
        animal a=new animal();
        return a;
    }
  class cargoPlane extends plane{
    public  tiger  fly()
{
    System.out.println("cargo Plane flies at lower height"); 
  tiger t=new tiger();
    return t;

}  }

}




public class override
{
      public static void main(String[] args) {
          
      }
}



