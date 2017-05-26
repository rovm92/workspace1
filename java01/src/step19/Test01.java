package step19;

public class Test01 {
  public static void main(String[] args) {
    Thread t = Thread.currentThread();
    System.out.println(t.getName());
    
    ThreadGroup g = t.getThreadGroup();
    System.out.println(g.getName());
    
    ThreadGroup g2 = g.getParent();
    System.out.println(g2.getName());
    
    ThreadGroup g3 = g2.getParent();
//    System.out.println(g3.getName());
    
    //system 하위 thread 그룹
    System.out.println("sys-----------------------");
    printThreadGroup(g2,"");
    
    // "system" 그룹의 소속되어 있는 스레드들
  }
  
  public static void printThreadGroup(ThreadGroup tg, String prefix){
    // 파라미터로 넘어온 스레드 그룹의 이름을 먼저 출력
    System.out.printf("%s['%s']--\n",prefix ,tg.getName());
    
    
    // 하위 스레드 그룹의 정보를 얻어서 출력
    ThreadGroup[] grouparray = new ThreadGroup[10];
    int count = tg.enumerate(grouparray, false);
    
    for(int i = 0; i < count; i++){
      printThreadGroup(grouparray[i], prefix + "  ");
    }
    Thread[] threadArray = new Thread[10];
    count = tg.enumerate(threadArray, false);
    for(int i = 0; i < count; i++){
      System.out.printf("%s-- (%s)\n",prefix + "  " ,threadArray[i].getName());
    }
  }
  
}
