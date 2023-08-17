package inheritance;

public class MultiChild  extends MultiParent{
	public void division()
	{
		System.out.println(g/k);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MultiChild obj1 =new  MultiChild();
		 obj1.division();
		 obj1.multiple();
		 System.out.println(obj1.g);
		 obj1.add();
	}
	

}
