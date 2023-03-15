import java.util.*;
public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		List<String> listOfString=
		Arrays.asList("Kriti","Mulu","Maloo","Anny","Ammy");
	
		System.out.println("normal loop");
		for(int i=0;i<listOfString.size();i++)
		{
		    System.out.println(listOfString.get(i));
		}
		System.out.println("enhanced for loop");
		for(String a: listOfString)
		{
		    System.out.println(a);
		}
		System.out.println("java8 loop");
		listOfString.stream().forEach(System.out::println);
		
		System.out.println("ietrator loop");
		Iterator<String>it= listOfString.iterator();
		while(it.hasNext())
		{
		    System.out.println(it.next());
		}
		
		System.out.println("ListIterator  loop");
		ListIterator<String> listIt= listOfString.listIterator();
		while (listIt.hasNext())
		{
		     System.out.println(listIt.next());
		}
		
		System.out.println("nwhile loop");
		int i=0;
		while(i<listOfString.size())
		{
		    System.out.println(listOfString.get(i));
		    i++;
		}
		System.out.println("itratable for each loop");
		listOfString.forEach(a-> System.out.println(a));
		
		
		
		
	}
}
