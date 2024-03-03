import java.util.*;

public class StudentRecords {
    public static void main(String[] args) {
    
    ArrayList<Student> studentList = new ArrayList<Student>();
    studentList.add(new Student("Zee" , "BSIT"));
    studentList.add(new Student("Ringostar" , "BSFA"));
    studentList.get(1).setName("Paul McCartney");
    
    //forEach Method #1
    studentList.forEach(myStudents -> System.out.println(myStudents.getCourse()));
    
     //forEach Method #2
    for(Student myList : studentList){
      System.out.println(myList.getName());
    }
    
     //forLoop Method
    for(int i=0 ; i < studentList.size() ; i++){
      System.out.println(String.format("%s is a %s student" , studentList.get(i).getName() , studentList.get(i).getCourse()));
    }
  }
}