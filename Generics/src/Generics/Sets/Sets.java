package Generics.Sets;
import java.util.*;

public class Sets{
	public static <T> Set<T> union(Set<T> a, Set<T> b){
		Set<T> result = new HashSet<>(a);
		result.addAll(b);
		return result;
	}
	
	public static <T> Set<T> intersection(Set<T> a, Set<T> b){
		Set<T> result = new HashSet<>(a);
		result.retainAll(b);
		return result;
	}
	
	public static <T> Set<T> difference(Set<T> a, Set<T> b){
		Set<T> result = new HashSet<>(a);
		result.removeAll(b);
		return result;
	}
	
	public static <T> Set<T> complement(Set<T> a, Set<T>b){
		return difference(union(a, b), intersection(a, b));
	}
}
