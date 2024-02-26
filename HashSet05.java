// 5. Write a Java program to test if a hash set is empty or not. 

import java.util.Set;
import com.hashset.*;

public class HashSet05 {
	public static void main(String[] args) {
		Set<String> colorSet = HashFactory.getHashSet();
		System.out.println("Is set empty? "+colorSet.isEmpty());
	}	
}
