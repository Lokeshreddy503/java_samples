
interface Test1 
{  
	void m1();
	
}
class loki implements Test1
{
	public void m1()
	{
		System.out.println("bye");
	}
	public static void main(String[] args)
	{
		loki k = new loki();
		//Test1 t = new Test1()
		{
			
		};
		k.m1();
		System.out.println(k.getClass().getName());
		
		
	}
	
}


	


