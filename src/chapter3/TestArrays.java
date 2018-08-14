package homework;

public class TestArrays {

	public static void main(String[] args) {
		int ref;
		int y = 0;
		int[] index = new int[4];
		
		while(y < 4) {
			String[] islands = new String[4];
			index[0] = 1;
			index[1] = 3;
			index[2] = 0;
			index[3] = 2;
			
			ref = index[y];
			
			islands[0] = "Bermuda";
			islands[1] = "Fiji";
			islands[2] = "Azores";
			islands[3] = "Cozumel";
			
			System.out.print("island = ");
			System.out.println(islands[ref]);
			
			y = y + 1;
		}
		
		
		
	}

}
