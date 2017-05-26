/* final : 메서드 선언에 final을 붙인다.
 * => 서브 클래스에서 재정의 할 수 없다.
 * => 서브 클래스에서 재정의 하지 말아야 할 메서드에 대해
 *    final을 붙인다.
 * => 보안상 재정의를 막기 위한 목적에 사용한다.
 * */
package step12.ex2;

public class B  extends A{
  /*public final void m() {
   // 상속 받은 메서드 중에서 final 붙은 메서든는 오버라이딩 할 수 없다. 
  }*/
}
