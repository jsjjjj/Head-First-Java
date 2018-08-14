package homework;

class Dog2 {
	
}

public class RadioReference {

	public static void main(String[] args) {
		
		//System.out.println(RadioOption.color);
		int x = (int) 36.8;
		int g = 17;
		int y = g;
		y = y + 10;
		short s;
		//s =  y;
		byte b = 3;
		byte v = b;
		short n = 12;
		//v = n;
		//byte k = 128;
		int p = 3 * g + y;
		
		System.out.println(p);
		
		Dog[] pets;
		pets = new Dog[7];
		pets[0] = new Dog();
		pets[1] = new Dog();
		System.out.println(pets[2]);
		
		pets[3] = pets[0];
		
		System.out.println(pets[3]);
		
	}

}
