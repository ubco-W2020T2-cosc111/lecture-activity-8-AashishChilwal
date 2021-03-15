import java.lang.Math.*;
import java.util.Scanner;
public class Task1
 {
	public static void main(String[] args) {
	    double total= 0,average;
	    int above=0,below = 0,i,f=0; 
	    Scanner input = new Scanner(System.in);
		for ( i = 0;i<100;i++)
		{
		    double a [] = new double [i]; 
		    System.out.print("Enter a number (-1 to end): ");
		    a[i] = input.nextInt();
		    if (a [i] == -1)
		        break;
		     f++;
		}
		for (int j = 0;j<a.length;j++)
		{
		    total = total+a[i];
		    if (below > a[i] ){
		        below ++;}
		    else if (above >= a[i]){
		        above++;}
		    else
		    {
		}
		        
		}
		average = total/a.length;
		System.out.println("Average: " + average);
		System.out.println("Total number of scores: "+ a.length);
		System.out.println("Number of scores above or equal to the average: " + above);
		System.out.println("Number of scores below the average: " + below);
	 }
 }
