package homeinheritance;

public class MultipleChildClass1 extends  MultiParentClass{
public void add()
{
	System.out.println(a+b);
}
public void division()
{
	System.out.println(c/d);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleChildClass1 obj= new MultipleChildClass1();
		obj.add();
		obj.division();
		obj.sub(32,11);
	}

}
