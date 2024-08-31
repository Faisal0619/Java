class Book
{
   private int pageNo;
   public void setPgNo(int a)
   {
    if(a>0)
    pageNo=a;
    else
    System.out.println("Invalid input to my property");
   }
   public int getPgNo(){
    return pageNo;
   }

}

public class encapsulation{
    public static void main(String[] args){
     Book b=new Book();
    // b.pageNo=-100; error
//     System.out.println(b.pageNo);
   b.setPgNo(100);
  System.out.println(b.getPgNo());
    }
}