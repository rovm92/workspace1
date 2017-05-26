/* 캡슐화 : 패키지 멤버 클래스에 붙일 수 있는 modifier  종류
 * => 패키지 멤버 클래스?
 *  소스 파일 가장 밖에 선언한 클래스이다.
 *  일반적으로 작성하는 클래스이다.
 * 
 * => (default) : 아무것도 붙이지 않는것
 *
 * => public 
 *  - 전부사용 가능
 * */
package step11;

public class Test06{
  
  public static void main(String[] args){
    // public 클래스는 다른 패키지에서 접근할 수 있다.
    step11.ex1.A obj1 = new step11.ex1.A();
    // (default) 클래스는 같은 패키지에서만 호출가는하다.
    // Test06은 B 클래스는 패키지가 다르기 때문에 접근 불가능!
    //step11.ex1.B obj = new step11.ex1.B();
    
  }
}
