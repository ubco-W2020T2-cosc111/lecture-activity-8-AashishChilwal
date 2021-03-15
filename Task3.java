import java.util.Scanner ; 
public class Main
{
	public static void main(String[] args) {
	 Scanner index = new Scanner(System.in);
	 double [] array = new double [10];
	 System.out.print("Enter ten numbers: ");
	 for (int i = 0; i<10; i++)
	 {
	     array [i] = index.nextDouble();
	 }
	 System.out.println("The min is "+ getMin(array));
	 System.out.println("The index of the min is "+ indexOfMin(array));
	}
		public static int getMin(double[] array) {
		
		double smallestnumber = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < smallestnumber) {
				smallestnumber = array[i];
			}
		}
		return (int) smallestnumber;
		}
	public static int indexOfMin(double[] array) {
		
		double smallest = array[0];
		int minIndex = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] < smallest) {
				smallest = array[i];
				minIndex = i;
			}
		}
		return minIndex;
	}
}
