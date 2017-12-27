package delete;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringArrayDuplicte {

	public static void main(String[] args) {
		String str=""; // Seprate Topic if we not initialize then it will not allow to Print if we intialize then it will print blank.
		System.out.println("This is String "+str);
		
		String[] data= {"A", "C", "B", "D", "A", "B", "E", "D", "B", "C"};
		System.out.println("Original Array "+Arrays.toString(data));
		List<String> list = Arrays.asList(data);
		Set<String> set = new HashSet<String>(list);
		System.out.println("Duplicate Removed");
		
		String[] result = new String[set.size()];
		set.toArray(result);
		for(String s: result)
		{
			System.out.print(s+",");
		}
		

	}	
}
