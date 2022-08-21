import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Eg02 {
	public static void main(String[] args) {

		// Print all friends in upper case
		final List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

		// Method 1
		final List<String> uppercaseNames = new ArrayList<String>();
		for (String name : friends) {
			uppercaseNames.add(name.toUpperCase());
		}
		

		// Method 2
		final List<String> uppercaseNames_method2 = new ArrayList<String>();
		friends.forEach(name -> uppercaseNames_method2.add(name.toUpperCase()));
		System.out.println(uppercaseNames);


		// Method 2 modified
		friends.stream().map(name -> name.toUpperCase())
						.forEach(name -> System.out.print(name + " "));
		System.out.println();
		
		
		final List<String> uppercaseNames_method2_modified = friends.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
		
		// Method 2 modified
		friends.stream().map(String::toUpperCase).forEach(name -> System.out.println(name));
		

		//Method 3 count length of name
		friends.stream().map(name -> name.length())
		.forEach(count -> System.out.print(count + " "));

		
	}
}
