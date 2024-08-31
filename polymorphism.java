class plane1
{

public void fly()
{
    System.out.println(" plane flies at  height");
}
public void takeoff()
{
    System.out.println(" plane requires  runway to takeoff");
}
}
class cargoplane1 extends plane1
{

public void fly()
{
    System.out.println("cargo plane flies at low height");
}
public void takeoff()
{
    System.out.println("cargo plane requires long runway to takeoff");
}
}
class fighterplane1 extends plane1
{

public void fly()
{
    System.out.println("fighter plane flies at high height");
}
public void takeoff()
{
    System.out.println("fighter plane requires short runway to takeoff");
}
}
class passengerplane1 extends plane1
{

public void fly()
{
    System.out.println("passenger plane flies at medium height");
}
public void takeoff()
{
    System.out.println("passenger plane requires medium runway to takeoff");
}
}
class airport
{
   public void  permit(plane1 p)
   {
      p.fly();
      p.takeoff();
}}





public class polymorphism
{
    public static void main(String[] args) {
          cargoplane1 cp=new cargoplane1();
          fighterplane1 fp=new fighterplane1();
           passengerplane1 pp = new passengerplane1();



           airport a= new airport();
           a.permit(pp);
           a.permit(cp);
           a.permit(fp);

//           plane1 p;
//           p=cp;
//           p.takeoff();//1:1
//           p.fly();//1:1
          
// /* same lines but different output*/
//           p=fp;//1:m polymorphism
//           p.fly();//1:1
//           p.takeoff();//1:1
   

//            p=pp;
//            p=cp;
//            p.takeoff()

    }
}