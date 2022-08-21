import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Eg05 {
	public static void main(String[] args) {
		
		final List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
		final Predicate<String> startsWithN = name -> name.startsWith("N");
		final Predicate<String> startsWithB = name -> name.startsWith("B");

		//Count items starting with N or B
		
		// method 1
		final long countFriendsStartN = friends.stream().filter(startsWithN).count();
		final long countFriendsStartB = friends.stream().filter(startsWithB).count();

		// method 2
		final long countFriendsStartN_method2 = friends.stream().filter(checkIfStartsWith("N")).count();
		final long countFriendsStartB_method2 = friends.stream().filter(checkIfStartsWith("B")).count();

		// method3
		final Function<String, Predicate<String>> startsWithLetter = (String letter) -> {
			Predicate<String> checkStarts = (String name) -> name.startsWith(letter);
			return checkStarts;
		};
		
		// method3 modified
		final Function<String, Predicate<String>> startsWithLetter_modified1 = (
				String letter) -> (String name) -> name.startsWith(letter);

		// method3 modified
		final Function<String, Predicate<String>> startsWithLetter_modified2 = letter -> name -> name.startsWith(letter);

		final long countFriendsStartN_modified = friends.stream().filter(startsWithLetter_modified2.apply("N")).count();
		final long countFriendsStartB_modified = friends.stream().filter(startsWithLetter.apply("B")).count();
		
		
	}

	public static Predicate<String> checkIfStartsWith(final String letter) {
		return name -> name.startsWith(letter);
	}
}
