// 3. Write a Java program to get the number of elements in a hash set. 

import java.util.Set;
import com.hashset.HashFactory;

public class HashSet03 {
	public static void main(String[] args) {
		Set<String> colorSet = HashFactory.getHashSet();

		System.out.println("Colors are: "+colorSet);
		System.out.println("Number of elements in set: "+colorSet.size());
	}
}
