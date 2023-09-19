package hashMap;
import java.util.HashMap;
public class UseEmployee {

	public static void main(String[] args) {
		Employee e1 = new Employee("kamal",3,45,"Male");
		Employee e2 = new Employee("raja",6,42,"Male");
		Employee e3 = new Employee("selvi",5,42,"Female");
		Employee e4 = new Employee("kalai",4,43,"Male");
		Employee e5 = new Employee("lataha",8,43,"Female");
		
		HashMap<Integer, Employee> emp = new HashMap<>();
		emp.put(e1.id, e1);
		emp.put(e2.id, e2);
		emp.put(e3.id, e3);
		emp.put(e4.id, e4);
		emp.put(e5.id, e5);
		for(Integer a: emp.keySet()) {
			System.out.println(emp.get(a).name);
		}
		
		for(Employee b: emp.values()) {
			System.out.println(b.name);
			System.out.println(b.age);
			System.out.println(b.gender);
		}
		
	}

}
