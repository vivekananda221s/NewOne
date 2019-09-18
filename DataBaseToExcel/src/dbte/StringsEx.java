package dbte;

import java.util.StringTokenizer;

public class StringsEx {

	public static void main(String[] args)
	{
		String name = "vivek@ananda@Reddy@1234";
		String st[] = name.split("@",4);
		
		for (String string : st) 
		{
			System.out.println(" "+string);
		}
	}

}
