package homeinheritance;

public class HomeMultiLevelInheritanceChild  extends HomeMultiLevelInheritanceParent{

	public void print()
	{
		System.out.println("Sajitha");
	}
	public void add()
	{
		System.out.println(a+b);
		System.out.println(c-d);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HomeMultiLevelInheritanceChild obj1= new HomeMultiLevelInheritanceChild();
		obj1.print();
		obj1.add();
		obj1.display();
		obj1.multiply();
		
	}

}
