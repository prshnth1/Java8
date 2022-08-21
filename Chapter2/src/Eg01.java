import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Eg01 {
	public static void main(String[] args) {

		// Print all friends
		final List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

		// Method 1
		for (int i = 0; i < friends.size(); i++) {
			System.out.println(friends.get(i));
		}

		// Method 2
		for (String name : friends) {
			System.out.println(name);
		}

		Consumer<String> printFriendName = (name) -> System.out.println(name);
		friends.forEach(printFriendName);
		
		
		// Method 3
		friends.forEach(new Consumer<String>() {
			public void accept(final String name) {
				System.out.println(name);
			}
		});

		
		
		
		// Method 3 modified
		friends.forEach((final String name) -> System.out.println(name));
		

		// Method 3 modified
		friends.forEach((name) -> System.out.println(name));
		
		//Method 3 modified
		friends.forEach(name -> System.out.println(name));
		
		//Method 3 modified
		friends.forEach(System.out :: println);
	}
	
	
		
	
}
