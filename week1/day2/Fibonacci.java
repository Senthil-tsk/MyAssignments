package week1.day2;

public class Fibonacci {
public static void main(String[] args) {
	
	int count =8;
	int num1=0, num2 =1;
	System.out.println("Fibinocci Series : "+count + " numbers");
	for(int i=0;i<=count;i++)
		{
			
	
		System.out.println(num1+" ");
		int sum=num1+num2;
		num1=num2;
		num2=sum;
		
		}
}
}
