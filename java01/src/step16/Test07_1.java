/* 키보드 입력처리
 * => System.in 객체가 입력 스트림이다.
 * 
 *  */
package step16;

import java.io.InputStream;
import java.util.Scanner;

public class Test07_1 {

  public static void main(String[] args) throws Exception{
    InputStream in = System.in;
    
    Scanner keyScanner = new Scanner(in);
    String str = keyScanner.nextLine();
    System.out.printf("=>%s\n",str);
    keyScanner.close();
    in.close();
  }
}
