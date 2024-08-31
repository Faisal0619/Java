
import java.util.Scanner;

class Guesser
{
    int guessnum;
  public int  guessNum(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Guesser guess the number");
         guessnum= scan.nextInt();
        return guessnum;
    }
}
class player{
    int pguessNum;
   public int  guessNumber()
    {
         Scanner sc=new Scanner(System.in);
        System.out.println("Player  guess the number");
         pguessNum= sc.nextInt();
        return pguessNum;
    }
    }
  
class Umpire
    {
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

   public void collectNumFromGuesser()
    {
        Guesser g=new Guesser();
        numFromGuesser=g.guessNum();
    }

  public void  collectNumFromPlayer(){
           player p1=new player();
            player p2=new player();
             player p3=new player();

             numFromPlayer1=p1.guessNumber();
             numFromPlayer2=p2.guessNumber();
             numFromPlayer3=p3.guessNumber();
    }
   public void compare()
    {
         if(numFromGuesser==numFromPlayer1)
         {
            if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
           {
            System.out.println("Game tied all the three players guessed correctly");
            }
         else if(numFromGuesser==numFromPlayer2)
         {
            System.out.println("player 1 and player 2 won the game");
         }
         else if(numFromGuesser==numFromPlayer3)
         {
            System.out.println("player 1 and player 3 won the game");
         }
         else
         {
            System.out.println("player 1 won the game");
         }
         }
         else if(numFromGuesser==numFromPlayer2)
         {
            if(numFromGuesser==numFromPlayer3)
            {
                 System.out.println("player 2 and player 3 won the game");
            }
            else{
                 System.out.println("player 2 won the game");
            }
         }
         else if(numFromGuesser==numFromPlayer3)
         {
             System.out.println(" player 3 won the game");
         }
        else
        {
             System.out.println("Game lost,Try Again");
        }

      }  }
class launchgame{

    public static void main(String args[])
    {
         Umpire   u = new Umpire();
         u.collectNumFromGuesser();
         u.collectNumFromPlayer();
         u.compare();
    }
}