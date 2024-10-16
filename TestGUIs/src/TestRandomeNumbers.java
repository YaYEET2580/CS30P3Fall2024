import java.util.*;

public class TestRandomeNumbers {

	public static void main(String[] args) {
		int highNum = 3;
		int lowNum = 0;
		int randomint;
		Random rand = new Random();
		
		randomint = rand.nextInt(highNum - lowNum + 1) + lowNum;
		
		System.out.println(randomint);
		
		

	}

}
