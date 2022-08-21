import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Eg04 {
	public static void main(String[] args) {
		final List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
		final List<String> editors = Arrays.asList("Brian", "Jackie", "John", "Mike");
		final List<String> comrades = Arrays.asList("Kate", "Ken", "Nick", "Paula", "Zach");

		//Count  list items with N
		
		//method1
		final long countFriendsStartN = friends.stream().filter(name -> name.startsWith("N")).count();
		final long countEditorsStartN = editors.stream().filter(name -> name.startsWith("N")).count();
		final long countComradesStartN = comrades.stream().filter(name -> name.startsWith("N")).count();

		//Method 2
		final Predicate<String> startsWithN = name -> name.startsWith("N");
		final long countFriendsStartN_method2 = friends.stream().filter(startsWithN).count();
		final long countEditorsStartN_method2 = editors.stream().filter(startsWithN).count();
		final long countComradesStartN_method2 = comrades.stream().filter(startsWithN).count();
	}
}
