import java.util.Arrays;
import java.util.List;

public class Eg01 {
	public static void main(String[] args) {
		/*
		 * 
		 * • Not having a name • Not having modifiers • Not having a return type:
		 * 
		 */

		Test inter1 = () -> {System.out.println("Hello World");};
		inter1.method1();
		
		AddTwoNumbers result = (a,b) -> a+b;
		
		int sum = result.add2Numbers(4, 5);
		System.out.println(sum);
		
		

		List<String	> names = Arrays.asList("Prakarti","Hamsa","Ranga");
		names.stream().forEach(System.out::println);
		
		
		//Threads
		Thread thread1 = new Thread(new MyThread());
		thread1.start();
		
		System.out.println("the end");
		
	
		
		Thread thread2 = new Thread(()-> {
			for(int i=0;i<10;i++) 
			{
				System.out.println(i);
			}
			});
		thread2.start();
		
	}

	public void printHelloWorld() {
		System.out.println("Hello World");
	}

	public void addTwoNumbers(int num1, int num2) {
		System.out.println("The sum of two numbers are " + (num1 + num2));
	}

}

class MyThread implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
}

interface Test {
	public void method1();
}

interface AddTwoNumbers {
	public int add2Numbers(int num1, int num2);
}

class TestImpl implements Test {

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
	}

}