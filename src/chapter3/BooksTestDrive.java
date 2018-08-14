package homework;

class Books {
	String title;
	String author;
	
}

public class BooksTestDrive {
	public static void main(String[] args) {
		Books[] myBooks = new Books[3]; // 그냥 빈값 null
		int x = 0;
		
		// 초기화를 시켜줘야함  NULL값 대신 주소값이 들어가있다.
		myBooks[0] = new Books();
		myBooks[1] = new Books();
		myBooks[2] = new Books();
		
		myBooks[0].title = "The Grapes of Java";
		myBooks[1].title = "The Java Gatsby";
		myBooks[2].title = "The Java  Cookbook";
		myBooks[0].author = "bob";
		myBooks[1].author = "sue";
		myBooks[2].author = "ian";
		
		while(x < 3) {
			System.out.print(myBooks[x].title);
			System.out.print(" by ");
			System.out.println(myBooks[x].author);
			x = x + 1;
			
		}
	}
}
