import java.lang.Math.*;
import java.util.Scanner;
public class Main
 {
	public static void main(String[] args) {
	    double average;
	    int above,below,i; 
	    double a [] = new double [100] ;
	    Scanner input = new Scanner(System.in);
		for ( i = 0;i<100;i++)
		{
		    System.out.print("Enter a number (-1 to end): ");
		    a[i] = input.nextInt();
		    if (a [i] == -1)
		        break;
		     
		}
		for (int j = 0;j<a[i].length();j++)
		{
		    average = IntStream.of(a[i]);
		}
	 }
 }
