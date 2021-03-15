import java.util.Scanner;
public class Task1
 {
	public static void main(String[] args) {
	    int average,above,below; 
	    int a [] = new int [100] ;
	    Scanner input = new Scanner(System.in);
		for (int i = 0;i<100;i++)
		{
		    System.out.print("Enter a number (-1 to end): ");
		    a[i] = input.nextInt();
		    if (a [i] == -1)
		        break;
		     
		}
	 }
 }
