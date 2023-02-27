import java.util.Scanner;
class K

	
	{
	public static void main(String[] args) 
	{ 
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Input your age :");
        int age = sc.nextInt();
	System.out.println("Your age is :" + age);
		Scanner sc1 = new Scanner (System.in);
		System.out.println("Input your spouse age  :");
        int spouseAge = sc.nextInt();
	System.out.println("Your age is :" + spouseAge);
	if (age > spouseAge)
	{
	
	System.out.println("You are older than yor spouse" );	
	
	}
	else 
	System.out.println("You are younger than your spouse:" );

	}
}