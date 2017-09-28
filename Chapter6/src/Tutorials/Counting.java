package Tutorials;

public class Counting {

	public static void main(String[] args) 
	{
		int numberLine = 2;
		for(int x = 0; x <=10; ++x)
		{
			System.out.print(x + " ");
			if(x % numberLine == 0)
			System.out.println();
		}
	}

}
