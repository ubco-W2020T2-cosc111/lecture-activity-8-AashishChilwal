# Lecture Activity 8 - Instructions

In lecture activity 8...

## General instructions for creating Java files

For each of the following Tasks, create a separate Java file called task1.java, task2.java, task3.java etc... 

Remember, to create a new file, first navigate to this directory locally using `cd path/to/this/repo` and then type: `code task1.java`.
This will open a new file called `task1.java` in Visual Studio Code.
You can also work in Geany, or Eclipse, it's your choice.


```
public class task1 {

	public static void main(String[] args) {
	  // Enter your code
	}
  
}
```

Don't forget to change the name of the public class method for each file!

## Task 1: 

Write a program that reads an unspecified number of scores and determines how many scores are above or equal to the average and how many scores are below the average. Enter a negative number to signify the end of the input. Assume that the maximum number of scores is 100, and that the user will enter only numbers.

### Sample Run

```
Enter a new score (-1 to end): 4
Enter a new score (-1 to end): 7
Enter a new score (-1 to end): 2
Enter a new score (-1 to end): 0
Enter a new score (-1 to end): 5
Enter a new score (-1 to end): -1
Average: 3.60
Total number of scores: 5
Number of scores above or equal to the average: 3
Number of scores below the average: 2
```

## Task 2: 

Write a method that returns the index of the smallest element in an array of doubles. If we have more than one equal smallest elements, return the smallest index. Use the following header:

```
public static int indexOfMin(double[] array)
```

Write a test program that prompts the user to enter ten numbers, invokes this method to return the index of the smallest element, and displays the index.

### Sample run

```
Enter ten numbers: 3 5 2 7 4 11 5 2 23 17
The index of the min is 2
```

## Task 3: 

Modify the code developed in Task 2 to include the following method: 

```
public static double getMin(double[] array)
```

The `getMin()` method returns the smallest element in an array of doubles. Use the `indexOfMin` method you developed in Task 2 to implement `getMin()`. 

### Sample Run

```
Enter ten numbers: 3 6 2 1 7 1 4 12 16 2
The min is 1.0
The index of the min is 3
```

## Task 4: Update your README file 

If you named your files as suggested above, you do not have to do anything in this section.
If you named your files differently, please update the links below to make sure they work.

[Task 1 Java file](./Task1.java)

[Task 2 Java file](./Task2.java)

[Task 3 Java file](./Task3.java)
