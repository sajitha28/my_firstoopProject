package homeinheritance;

public class MultipleChildClass2  extends MultiParentClass{
public void print()
{
	System.out.println("Sulu");
	
}
public void display()
{
	System.out.println("My age");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleChildClass2 obj1= new MultipleChildClass2();
		obj1.print();
		obj1.display();
		obj1.sub(34,7);
	}

}
