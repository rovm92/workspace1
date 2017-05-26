/* 소켓 프로그래밍 :  파일전송 클라이언트  프로그램
 *    
 * */
package step18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Test04_2 {
  public static void main(String[] args) throws Exception {
    if(args.length <3){
      System.out.println("[사용법] > java -cp bin step18.Test04_2 서버주소 포트번호 파일명");
      return;
    }
    
    File file = new File(args[2]);
    try(
    BufferedInputStream fileIn = new BufferedInputStream(new FileInputStream(file));
    
    Socket socket = new Socket(args[0], Integer.parseInt(args[1]));
    Scanner in = new Scanner(socket.getInputStream());
    DataOutputStream out = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));){    
      //1) 파일명 보내기
      out.writeUTF(file.getName());
      
      //2) 파일크기 보내기
      out.writeLong(file.length());
      
      //3)파일보내기
      for(int i = 0; i < file.length(); i++){
        out.write(fileIn.read());
      }
      out.flush();
   
      System.out.println(in.nextLine());
    } catch (Exception e){
      e.printStackTrace();
    }
  }
}
