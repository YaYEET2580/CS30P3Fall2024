package Puck_SKILLBUILDER;

public class Hockey {

	public static void main(String[] args) {
		Puck youthPuck = new Puck(4);
		Puck adultPuck = new Puck(5.5);
		
		//(Using youth puck for most of the printing examples)
		System.out.println(youthPuck.getWeight());
		System.out.println(youthPuck);
		System.out.println(youthPuck.getDivision());
		
		if (youthPuck.equals(adultPuck)) {
			System.out.println("The youth puck and adult puck are equal to each other.");
		}
		else {
			System.out.println("The youth puck and adult puck are NOT equal to each other.");
		}
		
		
		if (youthPuck.compareTo(adultPuck) == -1) {
			System.out.println("The weight of the youth puck is less than the weight of the adult puck.");
		}
		else if (youthPuck.compareTo(adultPuck) == 0) {
			System.out.println("The weight of the youth puck is equal to the weight of the adult puck.");
		}
		else if (youthPuck.compareTo(adultPuck) == 1) {
			System.out.println("The weight of the youth puck is equal to the weight of the adult puck.");
		}
		
		
		


	}

}
