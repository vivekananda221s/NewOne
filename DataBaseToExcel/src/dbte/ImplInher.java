package dbte;

public class ImplInher implements Definer
{

	public static void main(String[] args) 
	{
		ImplInher ob = new ImplInher();
		ob.x();
		Definer.y();
		ob.implmntit();
		
		String replaceTexr = "Vivek lovely";
		
		replaceTexr.replace("lovely","ananda Reddy");
		
		System.out.println("Name:"+replaceTexr.replace("lovely","ananda Reddy"));
	}

	@Override
	public void implmntit() {
		System.out.println("I am interface method. I am getting implemented here in the class");
		
	}

}
