// 7. Write a Java program to convert a hash set to a List and Array. 

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.hashset.*;

public class HashSet07 {
	public static void main(String[] args) {
		Set<String> colorSet = HashFactory.getHashSet();
		List<String> colorList = colorSet.stream().collect(Collectors.toList());
		
		System.out.println("Colors in List: "+colorList);

		String[] coStrings = new String[colorSet.size()];
		colorSet.toArray(coStrings);

		for (String coStrings2 : coStrings) {
			System.out.println(coStrings2);
		}

	}
}
