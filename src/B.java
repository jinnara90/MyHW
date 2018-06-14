public class B {
	String str,name,hobby;
	public B() {
		this.str = "";
	}
	public B(String str, String hobby) {
		this.str = str;
		this.hobby = hobby;
	}
	public void println() {
		System.out.println(str);
		System.out.println(name);
		System.out.println(hobby);
		System.out.println("Its devB");
	}
	public void set_name(String str){
		this.name = str;
	}

}