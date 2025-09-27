package w1.week1day2;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int a = 21,count =0;

	for (int i=2; i<a-1; i++)
	{
		int b = a%i;
	
	if (b==0)
	{
		count++;
	}
	}	
	
	
	if (count>=1)
	{
		System.out.println(a+" is not a prime number");
	}
	
	else 
	{
		System.out.println(a+" is a prime number");
	}
	}
	

}
