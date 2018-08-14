// 2018.05.10 static Test
package homework;


class RadioOption {
	static String color = "white";
	int volume = 5;
	boolean power = false;
}

public class Radio {
	public static void main(String[] args) {
		//RadioOption.color = "red";
		System.out.println(RadioOption.color); // static으로 인해 color가 JVM Heap영역에 올라갔다.
		// 정상 코드
		RadioOption a = new RadioOption();
		System.out.println(a.volume); 
		
		//System.out.println(RadioOption.volume); // 객체를 생성하지 않아 모른다
		
		a.power = true;
		System.out.println(a.power);
		
		int x = 100;
		System.out.println(x);
	}
}
