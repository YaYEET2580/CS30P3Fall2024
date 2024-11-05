package Puck_SKILLBUILDER;

public class Hockey {

	public static void main(String[] args) {
		Puck youthPuck = new Puck(4);
		Puck adultPuck = new Puck(5.5);
		
		System.out.println(adultPuck.getRadius());
		System.out.println(youthPuck.getRadius());
		System.out.println(adultPuck.getWeight());
		System.out.println(youthPuck.getWeight());
		System.out.println(adultPuck.getDivision());
		System.out.println(youthPuck.getDivision());


	}

}
