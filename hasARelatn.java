//dependent object
class Account 
{
    // instance variables
   String accType;
    String accNO;
    String accName;

// performing constructor injection
Account( String accType,String accNO,String accName)
{
    super();
    System.out.println("Account :: constructor");
    
    this.accType=accType;
    this.accNO=accNO;
    this.accName=accName;
}

    public String getAccType() {
        return accType;
    }

    public String getAccNO() {
        return accNO;
    }

    public String getAccName() {
        return accName;
    }



}
// target class
class employee
{
    private Integer eid;    
    private  String ename;
    private String eaddress;
 //HAS-A varaible injection
    private Account account;

// performing constructor injection (alt + shift +s then press o)
    public employee(Integer eid,String ename, String eaddress, Account account) {
            System.out.println("employee :: constructor");
        this.account = account;
        this.eaddress = eaddress;
        this.eid = eid;
        this.ename = ename;
    }
// code for displaying the data of employee
    public void display()
    {
            System.out.println(" employee:: Display method called");
    System.out.println("*********** EMPLOYEE  details are ********");
    System.out.println("EID is :: "+ eid);
      System.out.println("ENAME is :: "+ ename);
        System.out.println("EADDRESS is :: "+ eaddress);
         System.out.println("*********** ACCOUNT   details are ********");
          System.out.println("ACCNO  is :: "+ account.getAccNO());
          System.out.println("ACCTYPE  is :: "+ account.getAccType());
          System.out.println("ACCNAME  is :: "+ account.getAccName());

    }
}



public class hasARelatn
{
    public static void main(String[] args) {

        //createing an dependent object
        Account ac=new Account("sb-111","savings","faisal");
        //creating the target object and inject the dependent object in the constructor only
         employee emp =new employee (10, "faisal" ,"MI" ,ac);
         // checking the data of employee to see whether injection happened  or not
         emp.display();
    }
}