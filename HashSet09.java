import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;
import com.hashset.*;

public class HashSet09 {
	public static void main(String[] args) {
		TreeSet<String> treeColorString = new TreeSet<>(HashFactory.getHashSet());
		System.out.println(treeColorString);
		int index = Collections.binarySearch(new ArrayList<>(treeColorString),"Indigo");
		System.out.println("Indigo at: "+index);
	}
}
