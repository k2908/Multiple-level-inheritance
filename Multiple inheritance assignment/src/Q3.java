
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager Adam= new Manager();
		Adam.nationaity();
		Adam.organization();
		Adam.subordinates();
		Adam.place();
	
		
	}

}
class Person{
	
	public void nationaity(){
		System.out.println("i am from  ....");
	}
	public void place(){
		System.out.println("i stay in  ....");
	}
	
}
class Emp extends Person{
	
	public void organization() {
		System.out.println("i work in ...");
	}
	public void place(){
		super.place();
		System.out.println("i stay in   .... department");
	}
}
class Manager extends Emp{
	public void subordinates() {
		System.out.println("i have ... subordinates");
	}
	public void place(){
		super.place();
		System.out.println("i chair the  .... department");
	}
}
