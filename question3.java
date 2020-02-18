import java.util.Scanner;

public class Main{


	public static void main(String[]args){
		

		Scanner in = new Scanner(System.in);
		 

		 System.out.print("Input the 1st number: ");
 		 int a = in.nextInt();
   
  		System.out.print("Input the 2nd number: ");
  		int b = in.nextInt();
   
  		System.out.print("Input the 3rd number: ");
  		int c = in.nextInt();

  		if (a > b)
   		if ( a > c)
    System.out.println("The greatest: " + a);
   
  		if (b > a)
   		if (b > c)
    System.out.println("The greatest: " + b);
   
  		if (c > a)
   		if (c > b)
    System.out.println("The greatest: " +c);
 }
}