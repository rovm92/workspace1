/* 패키지*/

public class Test11 {
  public static void main(String[] args){
    System.out.println("Test11....");
  }

  public static void m1() {
    System.out.println("src/Test11.m1()...");
  }
}

/*
1) 패키지 무소속 클래스
 - 패키지에 소속되지 않은 클래스 파일을 만들 떄는 아무런 옵션 없이 클래스를 정의하면된다.

 2) 패키지 소속 클래스
 - 패키지에 소속시킬 클래스는 소스 파일 처음 부분에 패키지를 선언한다.
 -문법
 package 패키지명
 예) package other;
*/
