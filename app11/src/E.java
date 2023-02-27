class E
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if (false)
		   if (true)
		      System.out.println("if2 block begin");
	       else
		    System.out.println("else1 block");
	   else
		    System.out.println("else2 block");
		System.out.println("main end");
	}
}
