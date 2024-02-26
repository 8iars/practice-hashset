// 4. Write a Java program to empty an hash set. 

import java.util.Set;
import com.hashset.HashFactory;

public class HashSet04 {
	public static void main(String[] args) {
		Set<String> colorSet = HashFactory.getHashSet();

		System.out.println("Colors are: "+colorSet);
		colorSet.clear();
		System.out.println("Colors are after clearing: "+colorSet);
	}
}
