# 01 자바 개념정리 _ 제어자(modifier)


자바 코드 리뷰를 하면서 기초가 없다는걸 엄청나게 깨달았다. 일단 쓰긴 썼지만 왜 쓰는지 쓰면 알고 쓰는지 확실히 개념을 모르고 쓴 것을 느꼈다. 오늘은 접근제어자의 개념과 어떤 접근 제어자가 있는지 어떻게 쓸 수 있는지를 공부해볼 것 이다.

나는 접근 제어자가 그냥 접근 제어잔줄 알았는데
제어자 안에 접근제어자가 분류되어 있다.

## 1. 제어자
제어자는 주로 클래스나 멤버변수와 메서드에 사용 되며 하나의 대상에 대해서 여러 제어자를 조합하여 사용하는 것이 가능함.

	접근 제어자 - public, protected, default, private (접근을 많이 할 수 있는 순서대로 적음)
    그 외 - static, final, abstract, native, transient, synchronronized, volatile, strictfp
    
    
*접근 제어자란?
- 멤머 또는 클래스에 사용 되어서 외부에서 접근을 제한하는 역할을 한다.



1. 사용 될 수 있는 곳?
* private : 같은 클래스 내에서만 접근 가능
* default : 같은 패키지 내에서만 접근 가능
* protected : 같은 패키지 내에서, 그리고 다른 패키지의 자손 클래스에서 접근 가능
* public : 접근 제한이 전혀 없음

2. 접근 제어자를 사용하는 이유?
* 외부로부터 데이터를 보호하기 위해서




** 그 외 제어자
1. 	final - 마지막의, 변경 될 수 없는
2. 	final static


	 *  ** final 만 쓸 때 **
	 * 단순히 final만 쓴다면 값을 변경 할 수 없는 상수가 된다.
	 * 변수를 초기화 하지 않는다면 생성자에서 초기화 해줌.
	 * 
	 *   ** final static 쓸 때 **
	 * 값을 재정의 하고 싶지 않다면 final static 이용
	 * 
	 * 대체 둘이 뭐가 다르냐?
	 * 인스턴스화 하면서 final 변수를 생성자에서 초기화를 시키고 싶다면 static을 사			용하지 않겠고
	 * 값을 영원히 바꾸지 않겠다면 final static을 사용 하겠다.







참조

https://djkeh.github.io/articles/Why-should-final-member-variables-be-conventionally-static-in-Java-kor/
