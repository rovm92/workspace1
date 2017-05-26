/* File I/O - 바이너리 스트림 클래스 - InputStream III
 * => 바이트 배열을 읽은 후 퍼버에 저장하기
 * 
 **/
package step16;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test02_3_in {

  public static void main(String[] args) throws Exception{
FileInputStream in = new FileInputStream("test02_3.data");
    
    byte[] bytes = new byte[1024];
    int len = 0;
    
    len = in.read(bytes, 5, 2);
    
    for(int i = 0; i < 10; i++){
      System.out.printf("%x ",bytes[i]);
    }
    
    in.close();
  }
}
