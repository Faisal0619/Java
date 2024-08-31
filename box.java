//import java.util.*;
class box{
    double width;
     double height;
      double length;

      public static void main(String[] args) {
          box myobj =   new box();
          myobj.width=10;
           myobj.height=20;
            myobj.length=15;
             
             double vol;
             vol=myobj.width*myobj.height*myobj.length;
             System.out.println("volume of box is " + vol);
      }
}