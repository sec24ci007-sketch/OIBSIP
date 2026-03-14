import java.util.Scanner;
import java.util.Random;
class NumberGuessingGame{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    Random rand=new Random();
    int numbertoguess=rand.nextInt(100)+1;
    int attempts=0;
    while(true){
      System.out.println("Enter a Number:");
      int guessedno=sc.nextInt();
      attempts++;
      if(numbertoguess==guessedno){
        System.out.print("Correct! You took" + attempts + "tries");
        break;
      }
      else if(guessedno<numbertoguess){
          System.out.println("Low");
        }
      else{
        System.out.println("High");
      }}
    sc.close();
}}