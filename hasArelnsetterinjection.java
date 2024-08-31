//dependent object
class Account 
{
    // instance variables
   String accType;
    String accNO;
    String accName;

    

// performing setter  injection

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public void setAccNO(String accNO) {
        this.accNO = accNO;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }
// sending the data to the users through getters

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
  public void setEid(Integer eid) {
        this.eid = eid;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setEaddress(String eaddress) {
        this.eaddress = eaddress;
    }

    public void setAccount(Account account) {
        this.account = account;
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



public class hasArelnsetterinjection
{
    public static void main(String[] args) {

        //createing an dependent object
        Account ac=new Account();
        ac.setAccName("faisal");
        ac.setAccType("saving");
        ac.setAccNO("sb-1111");

        //creating the target object and inject the dependent object in the constructor only
         employee emp =new employee();
         emp.setEid(11);
         emp.setEaddress("ind");
         emp.setEname("faisal");
         //performing setter injection to Account
         emp.setAccount(ac);

         // checking the data of employee to see whether injection happened  or not
         emp.display();
    }
}