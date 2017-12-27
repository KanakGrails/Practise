package delete;

class Emp
{
 int id;
 String name;
 
 public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
	public String getName() 
	{
	return name;
	}
	
	public void setName(String name) {
	this.name = name;
	}
	
	public boolean equal(Object obj)
	{
		if(obj==null)return false;
		if(obj == this)return true;
		if(obj.getClass() != getClass()) return false;
		
		Emp e = (Emp)obj;
		//return e.getId() == this.getId();
		return e.getName() == this.getName();
	}
	
}


public class Employee {

	public static void main(String[] args) {
		Emp e1 = new Emp();
		e1.setName("Kanak");
		e1.setId(29);
		Emp e2 = new Emp();
		e2.setName("Vasudeva");
		e2.setId(91);
		
		Emp e3 = new Emp();
		e3.setName("Vasudeva");
		e3.setId(91);
		
		System.out.println(e1.equal(e2));
		System.out.println(e2.equal(e3));
		
	}


}
