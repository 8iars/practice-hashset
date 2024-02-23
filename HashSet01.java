// 1. Write a Java program to append the specified element to the end of a hash set. 

import java.util.Set;
import com.hashset.HashFactory;

public class HashSet01
{
	public static void main(String[] args) {
		Set<String> colorSet = HashFactory.getHashSet();

		System.out.println("hashset elements are: "+colorSet);

		System.out.println("Adding specified element at the end of the set");
		colorSet.add("Cyan");

		System.out.println("Color set is: "+colorSet);
	}
}