package dbte;

public interface Definer 
{
	int x=90;
	public void implmntit();
	default void x()
	{
		System.out.println("I am default method in Interface");
	}
	
	static void y()
	{
		System.out.println("I am static method in Interface");
		
	}

}
