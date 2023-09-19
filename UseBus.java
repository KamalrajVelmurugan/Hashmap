package hashMap;
import java.util.*;
public class UseBus {
	public static void main (String [] args) {
	Bus b1 = new Bus("12b","red",50,true);
	Bus b2 = new Bus("27a","pink",70,false);
	Bus b3 = new Bus("aag4","blue",44,true);
	Bus b4 = new Bus("646g", "pink",88,false);
	HashMap<String, Bus> buses = new HashMap<>();
	buses.put(b1.getNo(), b1);
	buses.put(b2.getNo(),b2);
	buses.put(b3.getNo(),b3);
	buses.put(b4.getNo(), b4);
	
//	buses.keySet().forEach(x -> {
//		if(buses.get(x).getColor().equals("pink")) {
//			System.out.println(buses.get(x));
//		}
//	});
//	
//	for(String y: buses.keySet()) {
//		if(buses.get(y).getColor().equals("pink")) {
//			System.out.println(buses.get(y));
//		}
//	}
//	for(Bus a: buses.values()) {
//		if(a.getColor().equals("pink")) {
//			System.out.println(a);
//		}
//	}
//	buses.forEach((x,y)-> System.out.println(x+""+y));
//	
//	HashMap<String,Bus> dbus = new HashMap<>();
//	buses.keySet().forEach(x -> {
//		if(buses.get(x).getisDiesel() == true) {
//			dbus.put(x, buses.get(x));
//		}
//	});
//	dbus.keySet().forEach(y -> System.out.println(dbus.get(y)));
//	dbus.values().forEach(k -> System.out.println(k));
	
//	for(String s: buses.keySet()) {
//		buses.remove(s);
//	}
	Iterator<String> i = buses.keySet().iterator();
//	while(i.hasNext()) {
//		System.out.println(buses.get(i.next()));
//	}
	while(i.hasNext()) {
		buses.remove(i);
	}


	
	}
}
