/* 데이터 프로세싱 스트림 클래스 - BufferedInputStream 도입 후
 * => 출력할 데이터를 먼저 버퍼에 출력한다.
 * 퍼버가 꽉차면 비로소 파일로 출력한다.
 * 
 */
package step16;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Test04_4_out {

  
  public static void main(String[] args) throws Exception{
    FileOutputStream out0 = new FileOutputStream("temp/test04_1.data");
    BufferedOutputStream out = new BufferedOutputStream(out0);
    long start = System.currentTimeMillis();
   
    for (int i = 0;i < 4000000; i++){
      out.write(i);
      if((i %10000)== 0 )System.out.print(".");
      if((i %500000)== 0 )System.out.println();
      
    }
   
    out.flush();
   long end =System.currentTimeMillis();
   System.out.printf("\n"+ "걸린시간 %d",end - start);
   
   out.close();
   out0.close();
  }
}
