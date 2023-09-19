package hashMap;
import java.util.HashMap;

public class Task_1 {

	public static void main(String[] args) {
		HashMap<Integer, String> students = new HashMap<>();
		students.put(1,"kamal");
		students.put(2, "raja");
		students.put(3, "Chandru");
		students.put(4, "Raja");
		System.out.println(students.get(1));
		System.out.println(students.get(4));
		for(Integer a: students.keySet()) {
			System.out.println(students.get(a));
			//System.out.println(a);
		}
		
		for(String s: students.values()) {
			System.out.println(s);
		}

	}

}
