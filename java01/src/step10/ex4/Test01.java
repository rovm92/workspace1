/* super 키워드의 사용
 * => 재정의하기 전의 메서드를 호출할 떄 사용한다.
 * => super가 수퍼 클래스를 가리키는 것이라고 착각을 많이 한다.
 * => 정의!
 *    자신을 제외한 조상 클래스를 따라 올라가면서 조상 클래스에서 메서드를 호출한다. 
 *    없으면, 컴파일 오류
 *    super가 안붙고, this가 붙으면 현재 클래스부터 찾아 올라간다.
 *    */
package step10.ex4;

public class Test01 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    C obj = new C();
    obj.test1();
    System.out.println("-----------");
    obj.test2();
    System.out.println("-----------"); 
  }

}
