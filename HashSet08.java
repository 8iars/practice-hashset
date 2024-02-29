// 8. Write a Java program to convert a hash set to a tree set. 

import java.util.Set;
import java.util.TreeSet;
import com.hashset.*;

public class HashSet08 {
	public static void main(String[] args) {
		Set<String> colorSet = HashFactory.getHashSet();
		TreeSet<String> treeColorSet = new TreeSet<>(colorSet);
		treeColorSet.forEach(System.out::println);		
	}
}
