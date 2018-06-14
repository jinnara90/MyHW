public class C {
	String str;
	public C() {
		this.str = "I am a girl";
	}
	public C(String str) {
		this.str = str;
	}
	public void show() {
		System.out.println(str);
	}
	public void set(String str) {
		this.str = str;
	}
	public void del_str(){
		this.str = "";
	}
}