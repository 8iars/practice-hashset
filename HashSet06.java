// 6. Write a Java program to clone a hash set to another hash set. 

import java.util.HashSet;
import com.hashset.*;

public class HashSet06 {
	public static void main(String[] args) {
		HashSet<String> colSet = HashFactory.getHashSet();
		@SuppressWarnings("unchecked")
		HashSet<String> colSet2 = (HashSet<String>) colSet.clone();

		System.out.println("colSet: "+colSet);
		System.out.println("colSet2: "+colSet2);
	}	
}
