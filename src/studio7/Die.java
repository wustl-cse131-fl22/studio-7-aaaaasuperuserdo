package studio7;

public class Die {

	public static int die(int sides) {
		
		int random = (int)(Math.random()*sides +1);
		
		return random;
	}
	
	public static void main(String[] args) {
		
		int sides = 8; 
		System.out.println(die(sides));
		
	}

}
