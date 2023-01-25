# Java

## 3.1

Hello.java 파일 실행하기

1. Hello.java 작성
2. javc Hello.java
3. java Hello

Hello.java 파일 이름과 클래스 이름은 대소문자 까지 같아야 한다.
2번 과정에서 javc 실행파일로 Hello.java로 부터 Hello.class 생성후에 java 실행파일로 클래스 파일 실행

---

자바의 모든 코드는 반드시 클래스 안에 존재 해야한다.
public staic void main(String[] args)는 main 메서드의 선언부인데 java에 의해서 실행될 수 있도록 반드시 적어야한다.
java app은 main메서드로 시작을 해서, main 마지막 문장까지 실행을 하면 모두 종료된다.
모든 클래스가 main 메서드를 가지고 있어야하는 것은 아니지만, 하나의 java app에는 main메서드를 포함한 클래스가 반드시 하나는 있어야한다.
하나의 소스파일에 보통은 하나의 클래스를 정의하지만 여러개의 클래스를 정의하는 것도 가능하다.
이때, 소스파일의 이름은 public class의 이름과 일치해야한다. public 클래스가 없다면, 소스파일에 있는 어떤 클래스의 이름으로 해도 상관 없다.

---

## 3.2 변수의 타입

변수는 primitive와 reference가 있다.

기본형(primitive)의 크기와 종류

        1 byte   2 byte   4 byte    8 byte

    논리형 boolean
    문자형          char
    정수형 byte     int     short   long
    실수형                  float   double

8bit = 1 byte

상수를 표현하기 위해서는 final 키워드를 사용한다.
final int MAX_NUMBER = 100;
상수는 선언시에 초기화를하는 것이 좋다.

리터럴 타입 접미사.
리터럴에 접미사를 사용해야하는 경우가 있다.
정수는 long일 때,
실수는 float일 때, 사용한다.
