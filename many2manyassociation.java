class Course
{
    private String cid;
    private String cname;
    private Integer cost;

    public Course(String cid, String cname, Integer cost) {
        this.cid = cid;
        this.cname = cname;
        this.cost = cost;
    }

    public String getCid() {
        return cid;
    }

    public String getCname() {
        return cname;
    }

    public Integer getCost() {
        return cost;
    }
    
    
}

class Student2{
private String sid;
 private Integer sage;
    private String sname;
   

 private   Course[] courses;

    public Student2(Course[] courses, Integer sage, String sid, String sname) {
        this.courses= courses;
        this.sage = sage;
        this.sid = sid;
        this.sname = sname;   
    }
 public void getStudentDetails2()
    {
            System.out.println("************* Student Details Are************");
            System.out.println("SID IS ::"+sid);
             System.out.println("Sname IS ::"+sname);
                 System.out.println("Sage IS ::"+sage);


                     System.out.println("--------------------");

        System.out.println("Course details are ::  ");
     for (Course course : courses) {
    System.out.println("CID is :: "+course.getCid());
     System.out.println("CNAME is :: "+course.getCname());
      System.out.println("COST is :: "+course.getCost());
            
          
     }
 }
   
}


public class many2manyassociation
{
    public static void main(String[] args) {
        // create dependent object (many)
        Course C1=new Course("INJava","Java",500);
          Course C2=new Course("INpython","Python",300);
            Course C3=new Course("INJs","JavaScript",400);
// creating an array  to perform many association to target object
            Course[] courses1 = new Course[2];
            courses1[0]=C1;
            courses1[1]=C3;
 

 Course[] courses2 = new Course[2];
            
            courses2[0]=C2;
            courses2[1]=C3;


            Course[] courses3 = new Course[3];
            courses3[0]=C1;
            courses3[1]=C2;
            courses3[2]=C3;



   // target object(many)
   Student2  s1=new Student2(courses1,24,"in263","faisal");
   Student2  s2=new Student2(courses2,25,"in264","ahmad");
   Student2  s3=new Student2(courses3,21,"in265","hamza");

s1.getStudentDetails2();
System.out.println();

s2.getStudentDetails2();
System.out.println();

s3.getStudentDetails2();
System.out.println();




    }
}