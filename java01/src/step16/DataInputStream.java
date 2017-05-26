package step16;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class DataInputStream {
  InputStream in;
  public DataInputStream(InputStream in) throws FileNotFoundException {
    this.in = in;
  }
  
  public byte readByte() throws IOException {
    return (byte)in.read();
  }
  
  public short readShort() throws IOException {
    short temp = (short)(in.read() << 8);
    temp|= (short)in.read();
    return temp;
  }
  
  public int readInt() throws IOException {
    int temp = (int)(in.read() << 24);
    temp |= (int)in.read() << 16;
    temp |= (int)in.read() << 8;
    temp |= (int)in.read();
    return temp;
  }
    
  public String readUTF() throws IOException {
    int len;
    len = in.read() << 8;
    len |= in.read();
    
    byte[] buf = new byte[len];
    in.read(buf);
    
    return new String(buf, "UTF-8");
  }
  
  public void close() throws IOException{
    in.close();
  }
    
}
