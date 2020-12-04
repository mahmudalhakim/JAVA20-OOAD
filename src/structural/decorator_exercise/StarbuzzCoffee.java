package structural.decorator_exercise;

public class StarbuzzCoffee {

	public static void main(String args[]) {

		Beverage beverage = new Whip(new Mocha(new DarkRoast()));
		System.out.println(beverage.getDescription()
				+ " $" + beverage.cost());



/*



		Beverage beverage2 = new Espresso();
		System.out.println(beverage2.getDescription()
				+ " $" + beverage2.cost());

		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() 
				+ " $" + beverage3.cost());

 */
	}
}
