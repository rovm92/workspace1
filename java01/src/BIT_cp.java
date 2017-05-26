import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BIT_cp {
  public static void copy(String filename1, String filename2) throws IOException{
    FileInputStream in = new FileInputStream(filename1);
    FileOutputStream out = new FileOutputStream(filename2);
    
    byte[] buf = new byte[8196];
    int len = 0;
    int count = 0;
    int countPoint =0;
    
    while ((len = in.read(buf)) != -1){
      out.write(buf);
      if(++countPoint % 50 == 0){
        System.out.println();
        }
    }
    if( len > 0){
      out.write(buf, 0 , len);
    }
    in.close();
  }
  
}
