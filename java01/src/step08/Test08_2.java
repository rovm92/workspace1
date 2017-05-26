/*  컬렉션 클래스 II: java.lang.HashSet
 *  => 저장하려는 객체데 대해 hashCode()를 호출하여 
 *    그 리턴 값을 가지고 저장할 위치를 계산한다.
 */
package step08;

import java.util.Properties;
import java.util.Set;

public class Test08_2 {
 
  public static void main(String[] args) throws Exception{
    Properties props = System.getProperties();
    
    Set<Object> keySet =  props.keySet();
    for(Object key : keySet)
      System.out.printf("%s=%s\n",key, props.get(key));

   }
}
