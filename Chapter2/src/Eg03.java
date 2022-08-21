import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Eg03 {
	public static void main(String[] args) {

		// Print all friends in upper case
		final List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

		// Method1 check friends starting with N
		final List<String> startsWithN = new ArrayList<String>();
		for (String name : friends) {
			if (name.startsWith("N")) {
				startsWithN.add(name);
			}
		}
		
					
		
		// method 2 check friends starting with N
		final List<String> startsWithN_method2 =
				friends.stream()
				.filter(name -> name.startsWith("N"))
				.collect(Collectors.toList());
		System.out.println(String.format("Found %d names", startsWithN.size()));
		
	}
}
