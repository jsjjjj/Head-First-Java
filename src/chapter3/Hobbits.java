package homework;

public class Hobbits {
	String name;
	public static void main(String[] args) {
		//Hobbits[] h = new Hobbits[3]; //012
		Hobbits[] h = new Hobbits[4]; //0123
		//int z = -1;
		int z = 0;
		while(z < 4) { // 0,1,2,3
		//while(z < 2) { // 0,1,2,3
			//z = z + 1;
			h[z] = new Hobbits();
			h[z].name = "bilbo";
			if(z == 1) {
				h[z].name = "frodo";
			}
			
			if(z == 2) {
				h[z].name = "sam";
			}
			
			System.out.println(h[z].name + " is a ");
			System.out.println("good Hobbit name");
			  
			z = z + 1;
		}
	}
	
	/*
	 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
       at homework.Hobbits.main(Hobbits.java:10)
       : 3번째 데이터가 들어갈 공간이 없다고 한다.

	 * 
	 * 
	 */

}
