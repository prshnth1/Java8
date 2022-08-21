import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Eg07 {
	public static void main(String[] args) {
		 List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

		System.out.println(
				"Total number of characters in all names: " + friends.stream().mapToInt(name -> name.length()).sum());

		
		friends.stream().reduce((name1, name2) -> name1.length()>=name2.length() ? name1: name2);
		
		
		
		//find longest  name
		
		final Optional<String> aLongName = friends.stream()
				.reduce((name1, name2) -> name1.length() >= name2.length() ? name1 : name2);
		aLongName.ifPresent(name -> System.out.println(String.format("A longest name: %s", name)));

		
		friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
		final String steveOrLonger = friends.stream().reduce("Steve",
				(name1, name2) -> name1.length() >= name2.length() ? name1 : name2);
		System.out.println(steveOrLonger);
		
	}
}
