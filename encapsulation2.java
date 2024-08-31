class Alien{
  private   int age;
   private String name;

   public void setAge(int x){
    if(x>0)
    age=x;
    else
    System.out.println("Invalid age,Enter valid age");
   }

   public void setName(String x)
   {
    name=x;
   }

   public int getAge()
   {
    return age;
   }
   public String getName()
   {
    return name;
   }


}


public class encapsulation2{
    public static void main(String[] args){
  Alien a =new Alien();
  // a.age=-10; error
  a.setAge(-10);
  a.setName("Faisal");
System.out.println(a.getAge());
System.out.println(a.getName());

    }
}