/*  컬렉션 클래스 II: java.lang.HashSet
 *  => 저장하려는 객체데 대해 hashCode()를 호출하여 
 *    그 리턴 값을 가지고 저장할 위치를 계산한다.
 */
package step08;

import java.sql.Date;
import java.util.HashSet;
import java.util.Iterator;

public class Test07_6 {
  
  static class Book {
    String title;
    String press;
    int page;
    
    public Book(String title, String press, int page){
      this.title = title;
      this.press = press;
      this.page = page;
    }
  
  public String toString(){
    return String.format("%s,%s,%d", title, press, page);
  }
  
  public int hashCode(){
    return 1;
  }
  
  /*hashCode() 메서드 뿐만아니라 equals()도 오버라디이 해야한다.
   * => 보통 두 객체가 같은지 비교할 때 hashCode()의 리턴 값과,
   *  equals()의 리턴 값을 모두 비교한다.
   * => 그렇게 허술하지 않다. 꼼꼼하다.
   *  */
  
  public boolean eauals(Object obj) {
    return true;
  }
 }
  public static void main(String[] args) {
     HashSet set = new HashSet();
     
     set.add(new Book("aaa","비트출판사",100));
     set.add(new Book("bbb","비트출판사",200));
     set.add(new Book("ccc","비트출판사",300));
     set.add(new Book("ddd","비트출판사",400));
     set.add(new Book("eee","비트출판사",500));
     set.add(new Book("fff","비트출판사",600));
     set.add(new Book("fff","비트출판사",600));
 
     Iterator iterator = set.iterator();
     while (iterator.hasNext()){
       System.out.println(iterator.next());
     }
     
     /* "fff" 제목의 책이 중복 저장되었다. 이유는?
      * => hashCode()의 리턴 값이 다르기 때문이다.
      * => hashSet은 값을 저장할 때 hashCode()의 리턴값을 가지고 위치를 계산하는데,
      *    같은 값을 갖고 있더라도 hashCode()의 리턴 값이 다르기 때문에,
      *    다른 위치로 저장되어서 중복된 것이다. */
     System.out.println(new Book("fff","비트출판사",600).hashCode());
     System.out.println(new Book("fff","비트출판사",600).hashCode());
     System.out.println(new Book("fff","비트출판사",600).hashCode());
     
     /*어? 객체가 처음 한 개만 저장되었네요?
      * => 우리가 hashCode()를 오버라이딩 할 때
      *   변수의 값에 상관없이 무조건 1을 리턴하게 했고,
      *   equals()의 리턴 값을 무조건 true를 리턴하게 했기 때문이다.
      * => HashSet 입장에서는 객체를 저장하기 전에 
      *   hashCode(), equals()를 호출해봤더니만, 같다라고
      *   결과가 나오기 때문에 같은 객체로 취급하여
      *   중복 저장하지 않는다.*/
   }
}
