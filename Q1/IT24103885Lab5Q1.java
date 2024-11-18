import java.util.Scanner;
public class IT24103885Lab5Q1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int firstNum,secondNum,thirdNum,smallestNum,largestNum;
		System.out.print("enter first number : ");
		firstNum = scanner.nextInt();
		System.out.print("enter second number : ");
		secondNum = scanner.nextInt();
		System.out.print("enter third number : ");
		thirdNum = scanner.nextInt();
	
		smallestNum = firstNum;
		largestNum = firstNum;
		
		if(secondNum < smallestNum)
			smallestNum = secondNum;
		else if(thirdNum < smallestNum)
			smallestNum = thirdNum;

		if(secondNum > largestNum)
			largestNum = secondNum;
		else if(thirdNum > largestNum)
			largestNum = thirdNum;
		
		System.out.println("User entered numbers are : " + firstNum + " " + secondNum + " " + thirdNum);
		System.out.println("smallest number : " + smallestNum );
		System.out.println("largest number : " + largestNum);
		
	}
}