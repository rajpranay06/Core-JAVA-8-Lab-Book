package lab9;

import java.util.*;
import java.util.function.*;

@FunctionalInterface
interface Square{
	public int square(int a);
}

@FunctionalInterface
interface Concat{
	public String concat(String a, String b);
}

@FunctionalInterface
interface Above50{
	public ArrayList<Integer> getAbove50(ArrayList<Integer> arr);
}

@FunctionalInterface
interface Even{
	public ArrayList<Integer> getEvenDigits(ArrayList<Integer> arr);
}

@FunctionalInterface
interface Odd{
	public int getOddElementsCount(ArrayList<Integer> arr);
}

@FunctionalInterface
interface Sort{
	public ArrayList<Integer> sortAscending(ArrayList<Integer> arr);
}

@FunctionalInterface
interface Max{
	public int getMax(ArrayList<Integer> arr);
}

@FunctionalInterface
interface Min{
	public int getMin(ArrayList<Integer> arr);
}

public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		Square sq = (a) -> a * a;
		Concat c = (a,b) -> a+b;
		
		System.out.println(sq.square(5) + "\n" + c.concat("Hello", "World!"));
		
		List<String> cars = Arrays.asList("RollsRoyce", "Mercedes", "Ferarri", "Audi");
		
		// Iterating list using lambda foreach
		cars.forEach(s -> System.out.println(s));
		
		//List of numbers
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		//Array size input
		System.out.println("Enter size:");
		int n = sc.nextInt();
		
		//Array elements
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++){
			a.add(sc.nextInt());
		}
		//Result Array
		ArrayList<Integer> ans;
		
		// Lambda Expression for finding elements above 50
		Above50 above50 = (arr) -> {
			ArrayList<Integer> res = new ArrayList<Integer>();
			for(int i=0;i<arr.size();i++){
				if(arr.get(i) > 50)
					res.add(arr.get(i));
			}
			return res;
		};
		
		System.out.println("Elements above 50 are:");
		ans = above50.getAbove50(a);
		ans.forEach(s -> System.out.println(s));
		
		// Lambda Expression for getting even elements
		Even getEven = (arr) -> {
			ArrayList<Integer> res = new ArrayList<Integer>();
			for(int i=0;i<arr.size();i++){
				if(arr.get(i)%2 == 0)
					res.add(arr.get(i));
			}
			return res;
		};
		
		System.out.println("Even Elements are:");
		ans = getEven.getEvenDigits(a);
		ans.forEach(s -> System.out.println(s));
		
		// Lambda Expression for getting count of odd elements
		Odd getOdd = (arr) -> {
			int res = 0;
			for(int i=0;i<arr.size();i++){
				if(arr.get(i)%2 != 0)
					res++;
			}
			return res;
		};
		
		System.out.println("Odd Elements count is: " + getOdd.getOddElementsCount(a));
		
		// Lambda Expression for sorting the list
		Sort sort = (arr) -> {
			Collections.sort(arr);
			return arr;
		};
		
		System.out.println("Sorted Array:");
		ans = sort.sortAscending(a);
		ans.forEach(s -> System.out.println(s));
		
		// Lambda Expression for finding max element
		Max max = (arr) -> Collections.max(arr);
		System.out.println("Maximum element is: " + max.getMax(a));
		
		// Lambda Expression for finding min element
		Min min = (arr) -> Collections.min(arr);
		System.out.println("Minimum element is: " + min.getMin(a));
		
		//Using Predicate from functions to find whether the key is present in the array or not
		Predicate<Integer> find = (key) -> a.contains(key);
		if(find.test(45))
			System.out.println("Key is found");
		else
			System.out.println("Key is not found");
		
		//Using Function from functions to print sum of elements
		Function<ArrayList<Integer>,Integer> sumOfArray = (arr) -> {
			int sum = 0;
			for(int i=0;i<n;i++)
				sum += arr.get(i);
			return sum;
		};
				
		System.out.println("Sum of the array:");
		System.out.println(sumOfArray.apply(a));
		
		//Using Consumer to print odd elements 
		Consumer<ArrayList<Integer>> oddElements = (arr) -> {
			System.out.println("Printing odd elements using Consumer Function");
			arr.forEach(s-> {
			if(s%2!=0){
				System.out.println(s);
			}});
		};
		
		//Using Supplier to reverse the array
		Supplier<ArrayList<Integer>> reverseArray = () -> {
			Collections.reverse(a);
			return a;
		};
		
		System.out.println("Array Reversed:");
		ans = reverseArray.get();
		ans.forEach(s -> System.out.println(s));
	}

}
