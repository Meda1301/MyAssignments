package w1.week1day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input = 12345, output=0;
		
		int a = input;
		for (int i=input; i>0; i=i/10)
		{
			int rem =input%10;
			output = output*10 + rem;
			input =input/10;
		}

		if(input == output)
		{
			System.out.println(a + " is a palindrome");
		}
		
		else
		{
			System.out.println(a + " is not a palindrome");
		}
		
	}
	

}
