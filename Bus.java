package hashMap;

public class Bus {
	private String no;
	private String color;
	private int noOfSeats;
	private boolean isDiesel;
 public void setNo(String no) {
	 this.no = no;
 }
 public String getNo() {
	 return no;
 }
 public void setColor(String color) {
	 this.color = color;
 }
 public String getColor() {
	 return color;
 }
 public void setNoOfSeats(int noOfSeats) {
	 this.noOfSeats = noOfSeats;
 }
 public int getNoOfSeats() {
	 return noOfSeats;
 }
public boolean getisDiesel() {
	return isDiesel;
}
public void setisDiesel(boolean isDiesel) {
	this.isDiesel = isDiesel;
}
public Bus(String no, String color, int noOfSeats,boolean isDiesel) {
	this.no = no;
	this.color = color;
	this.noOfSeats = noOfSeats;
	this.isDiesel = isDiesel;
	
}
public String toString() {
	return no+""+color+""+noOfSeats+""+isDiesel;
}
 
}
