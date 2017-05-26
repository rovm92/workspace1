/* 상속: 생성자 호출
 * => 모든 생성자는 첫 번째 명령으로 수퍼 클래스의 기본 생성자를 호출해야 한다.
 *  super();
 * => 만약 수퍼 클래스의 기본 생성자 호출하는 코드를 작성하지 않는다면,
 * 컴파일러가 생성자 블록의 첫 줄에 이 코드를 자동으로 삽입한다.
 * => 수퍼 클래스의 생성자를 호출하는 코드는 반드시 첫 명령어로 작성해야 한다.
 *  그 앞에 주석은 올 수 있으나, 다른 명령어가 와서는 안된다.
 * */

package step09.ex4;

public class Test01 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    new C();
    
  }

}
