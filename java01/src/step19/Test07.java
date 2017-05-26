/* 멀티태스킹 : 스레드 라이프 사이클
 * => 생명주기
 *             start()             sleep(),wait()
 * new Thread() ----> Runnable 상태 ----> Not Runnable 상태
 *                           |      <----
 *                           |  timeout, nofify()
 *                           |실행완료
 *                         dead
 * => Runnable 상태
 *  - CPU 쟁탈전에 놓인 상태
 *  - CPU를 받을 수 있는 상태
 *  - Runnable 상태에 있는 스레드 CPU를 사용하여 실행한다.
 * => Not Runnable 상태
 *  - CPU 쟁탈전에서 제외된  상태
 *  - CPU를 받을 수 없는 상태  
 * => 실행이 완료되면 Dead 상태가 되어 다시는 실행할 수 없다.
 *  반복 실행 할 수 없다.
 *  
 * => wait() 
 *  - 특정 객체를 사용하는 스레드에 대해 동작을 중지시킬 때 사용한다.
 * => notify(), notifyAll()
 *  - 특정 객체를 상요하ㅓ다가 잠시 멈추고 있는 스레드를 다시 가동할때 사용한다.
 **/
package step19;

public class Test07 {

  static class Food{
    synchronized public void eat() throws  Exception{ 
      this.wait();
      System.out.println("맛있게 먹는다.");
    }
    synchronized public void allow() throws  Exception{ 
      this.notify();
    }
  }
  static class Dog extends Thread{
    Food food;
    
    public Dog(Food food){
      this.food = food;
    }
    
    public void run(){
      try{
        food.eat();
      } catch(Exception e){
        e.printStackTrace();
      }
      System.out.println("싸우자! 멍!");
      
    }
  }
  
  static class Counter extends Thread {
    Food food;
    int count = 10;
    
    public Counter(Food food){
      this.food = food;
    }
    public void run(){
      while(true){
        count--;
        System.out.printf("먹기 %d 초 전...\n",count);
        if(count ==0){
          try {
            food.allow();
            return;
          } catch (Exception e) {
            e.printStackTrace();
          }
        }
        try{
          Thread.sleep(1000);
        }catch (Exception e){}
      }
    }
  }
  
  public static void main(String[] args) {
    Food food = new Food();
    Dog dog = new Dog(food);
    dog.start();
    
    Counter counter = new Counter(food);
    counter.start();
    System.out.println("보안 장치 작동");
  }
}
