import java.util.*;
class Test 
{
	public static void main(String[] args) 
	{
		LinkedList al = new LinkedList();
			al.add(10);
		al.add("lokesh");
		
		al.add(10.5f);
      System.out.println(al);
	  System.out.println(al.size());
	  al.add(0,"anu");
	  System.out.println(al);
	  System.out.println(al.size());
	  al.remove(0);
	  System.out.println(al);
	  
	  System.out.println(al);
	  System.out.println(al.contains("lokesh"));
	  System.out.println(al.isEmpty());
	  

	  
	}
}