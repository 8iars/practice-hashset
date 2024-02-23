// 2. Write a Java program to iterate through all elements in a hash list. 

import java.util.Set;
import com.hashset.HashFactory;
import java.util.Iterator;

public class HashSet02 {
	public static void main(String[] args) {
		Set<String> colorSet = HashFactory.getHashSet();
		Iterator<String> colorIterator = colorSet.iterator();
		
		int counter = 0;
		
		while (colorIterator.hasNext() && counter <3)
		{
			System.out.println(colorIterator.next());
			++counter;
		}		
		colorIterator.forEachRemaining(e->System.out.println(e.toUpperCase()));
		System.out.println("No changes to set: "+colorSet);
	}
}
