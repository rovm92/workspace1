/* 예외처리 : 자원을 자동 해제 try ~ catch ~ 블록(try ~ with ~ resources 문장)
 * => try (객체선언) ~
 *  try 괄호 안에 선언 할 수 있는 객체는 java.lang.AutoCloseable 규격에 따라 만든 객체만 가능하다.
 *  
 *  => java.lang.AutoCloseable 규격?
 *  자원을 자동으로 해제시킬 때 close() 메서드를 호출한다는 규칙이다.
 *  따라서 이 규칙을 준수하는 이 클래스는 반드시 이 규칙에 선언됨
 *  close() 메서드를 만들어야 한다. 
 * */
package step17;

public class Test14_3 {
  
  static class A{
    public void close() throws Exception{
      System.out.println("A.close()");
    }
  }
  
  static class B implements AutoCloseable{
    public void close() throws Exception{
      System.out.println("B.close()");
    }
  }
  public static void main(String[] args) {
    int age = 20;
    
    try( 
//        A oj1 =new A()
        B obj = new B();
    ){
      if(age < 19)
        System.out.println("미성년입니다.");
    }
    catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

}




