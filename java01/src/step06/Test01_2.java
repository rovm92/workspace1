
package step06;

public class Test01_2 {

  static class Student{
    String name;
    int[] scores = new int[3];
    int total;
    float aver;
  }
  
  public static void init(Student s, String name, int kor, int eng, int math){
    s.name = name;
    s.scores[0] = kor;
    s.scores[1] = eng;
    s.scores[2] = math;
    
  }
  
  public static void compute(Student s){
    s.total = s.scores[0] + s.scores[1] + s.scores[2];
    s.aver = s.total / 3f;
  }
  
  public static void print(Student s){
    System.out.printf("%s, %d, %d, %d, %d, %f\n",
        s.name, s.scores[0], s.scores[1], s.scores[2], s.total, s.aver); 
  }
  
  public static void main(String[] args){
    Student s1 = new Student(); 
    init(s1, "홍길동", 100, 100, 100);
    compute(s1);
    
    Student s2 = new Student();
    init(s2, "임꺽정", 90, 90, 90);
    compute(s2);
    
    Student s3 = new Student();
    init(s3, "유관순", 80, 80, 80);
    compute(s3);
    
   print(s1);
   print(s2);
   print(s3);
  }
}
