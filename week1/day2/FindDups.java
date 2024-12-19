package week1.day2;

public class FindDups {
public static void main(String[] args) {
	
	int[] numbers = {2, 5, 7, 7, 5, 9, 2, 3};
		
	
	for(int i=0; i<numbers.length; i++)
	{
		for(int j=i+1;j<numbers.length; j++)
		{	
			if(numbers[i]==numbers[j]) 
			
			System.out.println("Duplicate value "+numbers[i]);
		
}
		
	}
	}
}
