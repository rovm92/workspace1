/* File I/O - 바이트 스트림 클래스 - MyDataOutputStream
 * => FileOutputStream을 상속하여 출력
 *  */
package step16;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test02_5_out {

  public static void main(String[] args) throws Exception{
    MyDataOutputStream out = new MyDataOutputStream("test02_5.data");
    
    byte b = 0x11;
    short s = 0x2233;
    int i = 0x44556677;
    String str =  "ABC가각간";
    
    out.writeByte(b);
   
    out.writeShort(s);
    
    out.writeInt(i);
    
    out.writeUTF(str);
    
    out.close();
    System.out.println("파일 출력 완료!");
  }

  private static byte[] getBytes(String str) {
    // TODO Auto-generated method stub
    return null;
  }
}