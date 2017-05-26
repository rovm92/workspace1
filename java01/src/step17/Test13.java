package step17;

public class Test13 {
  
  public static void main(String[] args) {
    try {
      if (args.length < 1) {
        System.out.println("[사용법] java -cp bin step11.Test13 숫자");
        return;
      }
      
      System.out.println(Integer.parseInt(args[0]));
      
    } catch (Exception e) {
      e.printStackTrace();
      
    } finally {
      // 이 블록은 try 또는 catch 블록을 떠나기 전에 반드시 실행된다.
      // 그래서 보통 자원을 해제하는 코드를 둔다.
      // 예) 파일 객체를 닫기, 소켓 객체를 닫기, DB 연결을 닫기 등.
      System.out.println("오호라~~~");
    }
    System.out.println("안녕!");
  }

}




