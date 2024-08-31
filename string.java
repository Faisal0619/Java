class string{
    public static void main(String[] args) {
    //     String s=new String("sachin");IMMUTABLE
    //     s.concat("tendulkar");
    //     System.out.println(s);
    // }
//     StringBuffer sb=new StringBuffer("sachin"); MUTABLE
//     sb.append("tendulkar");
//    System.out.println(sb);

       //      String s1=new String("sachin");//IMMUTABLE
     //   String s2=new String("sachin");
      //  System.out.println(s1==s2);false
       //System.out.println(s1.equals(s2));true
          
//   StringBuffer sb1=new StringBuffer("sachin");//MUTABLE
    //    StringBuffer sb2=new StringBuffer("sachin");
        //  System.out.println(sb1==sb2);false
     //  System.out.println(sb1.equals(sb2));false

// StringBuilder sb1=new StringBuilder("sachin");
// StringBuilder sb2=new StringBuilder("sachin");
// System.out.println(sb1==sb2);false
//       System.out.println(sb1.equals(sb2));false


// final StringBuffer sb=new StringBuffer("sachin");
// sb.append("ind");
// System.out.println(sb);//sachinind
// sb=new StringBuffer("tendulkar");//compileTimeError
// System.out.println(sb);




 // StringBuffer sb = new StringBuffer();
 //System.out.println(sb.capacity());//16// 
// sb.append("cvxkjdlkfjkjhrsdsgdghf");
// System.out.println(sb.capacity());//(16+1)*2=34
// sb.append("cvxkjddgdsgl");
// StringBuffer sb = new StringBuffer(19);
//  System.out.println(sb.capacity());//19

// StringBuffer sb = new StringBuffer("hkjdfshaewe");
//  System.out.println(sb.capacity());//length of string + 16=27
//  System.out.println(sb.length());//11

// StringBuffer sb = new StringBuffer();
//  System.out.println(sb.capacity());
//   sb.append("the value of pi is ::");
//  sb.append(3.1414);
//   sb.append(",this is exactly");
//    sb.append("true");
//    System.out.println(sb);
//    System.out.println(sb.capacity());//70
//    System.out.println(sb.length());//47
// StringBuffer sb = new StringBuffer("abcdefgh");
// sb.insert(2,"xyz");
// System.out.println(sb);
// sb.insert(11,9);
// System.out.println(sb);
// StringBuffer sb = new StringBuffer("sachinrameshtendulkar");
// System.out.println(sb);//Sachinrameshtendulkar
// sb.setLength(6);
// System.out.println(sb.length());//6
// System.out.println(sb);//sachin

/*copy one string to another without using inbuilt method*/
// String s1="iNeuron";
// String s2="";
// for (int i = 0; i <s1.length() ; i++) {
//     s2=s2+s1.charAt(i);
// }
// System.out.println(s1+"space");
// System.out.println(s2);

//********************************************************* */
// char ch='a';
// ch=(char)(ch-32);
// System.out.println(ch);//A
//convert lower to upper without using inbuilt methods//
// String s1="ineuron";
// String s2="";
//  for (int i = 0; i <s1.length() ; i++) {
//      s2=s2+(char)(s1.charAt(i)-32);// if we have to convert upper to lower we need to do '+' instead
//  }
//  System.out.println(s1+"space");
//  System.out.println(s2);


// String s1="ineuron";//iNeuron=norueNi
// String s2="";
//  for (int i =s1.length()-1 ;i>=0; i--) {
//      s2=s2+(char)(s1.charAt(i));// if we have to convert upper to lower we need to do '+' instead
//  }
//  System.out.println(s1+" ");
//  System.out.println(s2);


/******************************* */
//Think Twice=== Twice Think
String s1="Think Twice";//iNeuron=norueNi
String s2="";
String a[]=s1.split(" ");
 for (int i =a.length-1 ;i>=0; i--) {
     s2=s2+a[i]+ " ";// if we have to convert upper to lower we need to do '+' instead
 }
 System.out.println(s1+" ");
 System.out.println(s2);




    }
}