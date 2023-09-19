package hashMap;
import java.util.HashMap;
public class Task_2 {

	public static void main(String[] args) {
		HashMap<Integer, String> players = new HashMap<>();
		players.put(45, "RohitSharma");
		players.put(18, "ViratKholi");
		players.put(07, "Ms.Dhoni");
		players.put(8, "Ravindra Jadaja");
		players.put(03, "Suresh Raina");
		players.put(17, "rishapPant");
		players.put(63,"Suryakumar Yadav");
		
		for(Integer a: players.keySet()) {
			System.out.println(players.get(a));
		}
		for(String b: players.values()) {
			System.out.println(b);
		}
		
		

	}

}
