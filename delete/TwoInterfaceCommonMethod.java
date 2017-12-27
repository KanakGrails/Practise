package delete;

interface A 
{
	public void color();	
}
interface B
{
	public void color();	
}

class ImplofAB implements A,B
{
  public void color()
  {
	  System.out.println("Common to all");
  }
  public A choose(A a)
  {
	  return new A(){

		@Override
		public void color() {
		System.out.println("This is colr isntace frrom interface A");	
		}};
  }
  public B choose(B b)
  {
	  return new B(){
		  @Override
		  public void color()
		  {
			System.out.println("This is the color method from interface B");  
		  }
	  };
			  
  }
}


public class TwoInterfaceCommonMethod extends ImplofAB {

	public static void main(String[] args) {
		A a = new ImplofAB();
		B b = new ImplofAB();
		
		a.color();
		b.color();
		
		ImplofAB obj = new ImplofAB();
		a=obj.choose(a);
		b=obj.choose(b);
		
		a.color();
		b.color();

	}

}
