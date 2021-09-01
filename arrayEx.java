package arrayexercise.qa;

import java.util.ArrayList

public class arrayEx {
        
	public static void CoffeeArray() {
		String[] orderArray = new String[9];
		String[] doneOrderArray = new string[2];
				
		ArrayList<String> coffeeDrinks = new ArrayList<>();
		ArrayList<String> doneCoffeeDrinks = new ArrayList<>();
		coffeeDrinks.add("Small espresso w/ chocolate");    //add order
		coffeeDrinks.add("Cold brew w/ double shot");
		coffeeDrinks.add("Medium Cappucino w/ oat milk");
		coffeeDrinks.add("Medium flat white");
		coffeeDrinks.add("Large cho cookie frappe w/ sugar free syrup");
		coffeeDrinks.add("small caramel iced latte w/ honeycomb dust");
		coffeeDrinks.add("Small Americano");
		coffeeDrinks.add("Strawberry iced tea");
		coffeeDrinks.add("Cafe au Lait w/ extra milk");
		
		System.out.println(coffeeDrinks);                   //print order
		
		coffeeDrinks.remove(2);                           //remove an order
		System.out.println(coffeeDrinks);
		
		System.out.println(coffeeDrinks);
		
	}
}
