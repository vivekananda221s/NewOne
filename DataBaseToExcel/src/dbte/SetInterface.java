package dbte;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface
{

	public static void main(String ar[])
	{
		
		Map <Integer,String> data = new HashMap<Integer,String>();
		
		data.put(1, "vivek");
		data.put(2,"hhjjh");
		data.put(2,"herewjh");
		data.put(2,"efjkjk");
		
		Set <Integer> keys = data.keySet();
		 int i = keys.size();
		 
	
			System.out.println(" key:"+keys);
		
		Collection<String> values = data.values();
		
		
			System.out.println("Values:"+values);
	
		
	}
}
