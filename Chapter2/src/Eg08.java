import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Eg08 {
	public static void main(String[] args) {

		List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

		//Joining elements 
		for (String name : friends) {
			System.out.print(name + ", ");
		}
		System.out.println();

		//joining elements properly
		for (int i = 0; i < friends.size() - 1; i++) {
			System.out.print(friends.get(i) + ", ");
		}
		if (friends.size() > 0)
			System.out.println(friends.get(friends.size() - 1));

		//simplest way of joinnig elements
		System.out.println(String.join(", ", friends));
		
		
		System.out.println(
				friends.stream()
				.map(String::toUpperCase)
				.collect(Collectors.joining(", ")));
	}
}
