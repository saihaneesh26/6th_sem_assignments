
public abstract class Beverage {
	
	protected void boil_water() {
		System.out.println("BOILING WATER");
	}
	
	protected abstract void add_ingredients();
	
	protected abstract void serve();
	public void prepare() {
		boil_water();
		add_ingredients();
		serve();
	}
}
