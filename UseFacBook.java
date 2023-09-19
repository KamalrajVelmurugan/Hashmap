package hashMap;
import java.util.HashMap;
public class UseFacBook {

	public static void main(String[] args) {
		FaceBook f1 = new FaceBook(88993322l, 1234, "kakamutai","kakaka@gmail.com");
		FaceBook f2 = new FaceBook(97993322l, 678, "hello","hello@gmail.com");
		FaceBook f3 = new FaceBook(86993322l, 9999, "ravi","ravi@gmail.com");
		FaceBook f4 = new FaceBook(33993322l, 8888, "kamal","kamal@gmail.com");
		FaceBook f5 = new FaceBook(99993322l, 7777, "kavi","kavi@gmail.com");
		FaceBook f6 = new FaceBook(75993322l, 9900, "kalai","kalai@gmail.com");
		HashMap<Long, FaceBook> fb =new  HashMap<>();
		fb.put(f1.getMobileNo(), f1);
		fb.put(f2.getMobileNo(), f2);
		fb.put(f3.getMobileNo(), f3);
		fb.put(f4.getMobileNo(), f4);
		fb.put(f5.getMobileNo(), f5);
		fb.put(f6.getMobileNo(), f6);
		
//		for(Long a: fb.keySet()) {
//			System.out.println(a);
//		}
		//fb.keySet().forEach(x -> System.out.println(fb.get(x)));
		fb.values().forEach(y -> System.out.println(y));
		//fb.forEach(x,y ->   System.out.println(x+""+y));
		
		

	}

}
