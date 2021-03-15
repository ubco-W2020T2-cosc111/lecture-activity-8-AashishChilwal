import java.lang.Math.*;
import java.util.Scanner;
public class Main
 {
	public static void main(String[] args) {
	    double a [] = new double [100]; 
	    double total= 0,average;
	    int above=0,below = 0,i,f=0,b=0,a_1=0; 
	    Scanner input = new Scanner(System.in);
		for ( i = 0;i<100;i++)
		{
		    System.out.print("Enter a number (-1 to end): ");
		    a[i] = input.nextInt();
		    if (a [i] == -1)
		        break;
		     f++;
		    total = total+a[i];
		}
			average = total/f;
		for (i = 0;i<f;i++)
		{
		  if (a[i] >= average){
		    a_1++;
		  }
		  else if (a[i] < average ){
		    b++;
		      
		  }
		    else
		    {}
		        
		}
		System.out.println("Average: " + average);
		System.out.println("Total number of scores: "+ f);
		System.out.println("Number of scores above or equal to the average: " + a_1);
		System.out.println("Number of scores below the average: " + b);
	 }
 }
