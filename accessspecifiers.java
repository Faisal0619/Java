class plane{

   public  void fly()
   {
     System.out.println("Plane is flying");
   }

   public void takeoff()
   {
System.out.println("plane is taking off");
   }
}
class cargoplane extends  plane
 {
    public void fly()
    {
    System.out.println("cargo plane flies at lower height");
    }

    public void carryGoods()
    {
        System.out.println("cargo Plane carry goods");
    }
}
class passengerplane extends  plane
 {
 public void fly()
    {
    System.out.println("passenger plane flies at medium height");
    }
 public void carrypassengers()
    {
        System.out.println("passenger Plane carry passengers");
    }

}





public class accessspecifiers{

public static void main(String[] args) {
    // cargoplane cp = new cargoplane();
      plane cp = new cargoplane();//upcasting
    cp.fly();
    cp.takeoff();
    // cp.carryGoods();// cannot access it
    // however it can access it by changing the behavior --> specailized methods  **downcasting**
              ((cargoplane)cp).carryGoods();

    // passengerplane pp = new passengerplane();
    plane pp = new passengerplane();
    pp.fly();
    pp.takeoff();


}
}