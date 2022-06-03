
public class Coffee extends Beverage {

	@Override
	protected void add_ingredients() {
		System.out.println("Adding ingredients required for COFFEE");
		System.out.println("Adding Sugar");
		System.out.println("Adding COFFEE BEANS");
		System.out.println("Adding WATER");
		System.out.println("Adding MILK");
	}

	@Override
	protected void serve() {
				System.out.println("SERVING BEVERAGE COFFEE");			
	}
	
}
