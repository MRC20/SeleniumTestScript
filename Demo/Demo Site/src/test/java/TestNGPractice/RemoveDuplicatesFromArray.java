package TestNGPractice;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String>lst=new ArrayList<String>();
		lst.add("a");
		lst.add("a");
		lst.add("b");
		lst.add("c");
		lst.add("a");
		
		Set<String> removedupli=new LinkedHashSet<String>(lst);
		System.out.println(removedupli);
	}

}
