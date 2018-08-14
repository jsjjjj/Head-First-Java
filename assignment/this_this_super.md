# 01 자바 개념정리 _ this, this(), super()

자신을 가르키는게 this라면 부모를 가르키는것은 super


## 1. this

클래스 내 에서 사용 하고  인스턴스의 자기자신을 의미 한다.  

	class Student {
        String name;
        int age;

        public Student(String name, int age) {
            // this.name은 Student클래스 안에 선언 된 name 인스턴스를
            // 가리키는 의미다.
            this.name = name;
            this.age = age;
        }
    }

## 2. this()
자기 자신의 생성자를 호출하여 사용함으로 서 생성자 초기화 과정을 반복하지 않는다. 

	class AccessChild {
		public AccessChild() {
          this.x = 10;
          this.y = 20;
        }

        public AccessChild(int x) {
            this();
            this.x = x;
        }

        public AccessChild(int x, int y) {
            this(x);
            this.y = y;
        }
	}


## 3. Super() 와 부모생성자


	public class AccessChild {
        public AccessChild1() {
            System.out.println("AccessChild 의 기본생성자 입니다.");
        }
        public class AccessChild1 extends AccessChild {
            public AccessChild1() {
                System.out.println("AccessChild1의 기본생성자 입니다.");
            }
        }
    }
    
    
* 인스턴스화 하면 자식 객체가 올라 갈 때 부모도 함께 메모리에 올라간다.

** 근대 super() 왜쓰냐

자식은 부모를 알지만 부모는 자식을 모른다. 그래서 자식은 부모를 책임 져야 한다. 그러기 때문에 자식이 부모의 객체생성을 책임져 줘야 한다. ??
그래서 상위자 호출 super()가 필요하다.



