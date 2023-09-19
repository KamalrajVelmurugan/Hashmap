package hashMap;

public class FaceBook {
	private long mobileNo;
	private int password;
	private String idName;
	private String email;
	
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public int getPassword() {
		return password;
	}
	public void setIdName(String idName) {
		this.idName = idName;
	}
	public String getIdName() {
		
		return idName;
	}
	public void setEmail(String email) {
		
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public FaceBook(long mobileNo, int password, String idName, String email) {
		this.mobileNo = mobileNo;
		this.password = password;
		this.idName = idName;
		this.email = email;
		
	}
	public String toString() {
		return ""+mobileNo+""+email;
	}

}
