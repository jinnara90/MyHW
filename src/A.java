public class A {
	public static void main(String[] args) {
		System.out.println("****************");
		B b = new B("Hello!","BaseBall!!");
		b.set_name("JunYeong");
		b.println();
		C c = new C("World!");
		System.out.println(c.str);
		c.del_str();
		System.out.println(c.str);


		c.show();
		System.out.println("Its devB");

		System.out.println("Its devC");

	}
}