package SS8.examPratice;
import java.util.ArrayList;

 class Student {
     private String id;
     private String name;
     private int score;

     public Student (String id,String name,int score){
         this.id=id;
         this.name=name;
         this.score=score;
     }

public String getId(){
         return this.id;
 }
public void setId(String id){
       this.id=id;
     }
public String getName(){
         return this.name;
     }
public void setName(String name){
        this.name=name;
     }
public int getScore(){
         return this.score;
     }
public void setScore(int score){
         this.score=score;
     }
public void getRank(){
      String rank;
      if(this.score>=8){
          rank="Gioi";
      }else if(this.score>=6.5 && this.score<8){
       rank="Kha";
      }else{
          rank="Trung Binh";
      }
      System.out.printf("%s,%s,%d,%s",this.id,this.name,this.score,rank);
 }
}

class ManagerStudent {
    private ArrayList<Student> students;

    public ManagerStudent() {
        students = new ArrayList<>();
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void displayStudents() {
        for (Student s : students) {
            s.getRank();
            System.out.println();
        }
    }

    public void searchByRank(String rank) {
        for (Student s : students) {
            String r;
            if (s.getScore() >= 8) r = "Gioi";
            else if (s.getScore() >= 6.5) r = "Kha";
            else r = "Trung Binh";

            if (r.equalsIgnoreCase(rank)) {
                s.getRank();
                System.out.println();
            }
        }
    }

    public void sortByScoreDesc() {
        students.sort((s1, s2) -> Integer.compare(s2.getScore(), s1.getScore()));
    }
}

