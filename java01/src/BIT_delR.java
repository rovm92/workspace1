import java.io.File;
import java.io.IOException;
//file.isFile()
public class BIT_delR {
  public static void deleteR() throws IOException{
  
  }
  
  public static void displayDirectory(File dir, int level, String s){
    File[] files = dir.listFiles();
    int snum = s.length();
    String str = s.substring(1, snum);
    int snum2;
    String str2,str22;
    
    
    for(File file : files){
      snum2 = file.getName().length();
      str22 =  file.getName();
      if(snum < snum2){
        str2 = str22.substring(snum2-snum+1,snum2);
      } else{
        str2 = str22;
      }
      if(str2.equals(str)){
        System.out.println(file.getPath());
        File d = new File(file.getPath());
        d.delete();
      }
      if(file.isDirectory()){
        displayDirectory(file, level+1, s);
      }
    }
    
  }
}
