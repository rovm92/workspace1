package step10.ex4;

public class B extends A {
  int b;
  
  public void m1(){
    System.out.println("B.m1()"); // A.m1 재정의
  }
  
  public void m2(){
    System.out.println("B.m2()"); // A.m2 재정의
  }
  
  public void m4(){
    System.out.println("B.m4()"); // 새로 추가
  }
}
