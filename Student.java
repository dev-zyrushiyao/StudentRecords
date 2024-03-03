public class Student {

  private String name;
  private String course;
  
  public Student(){
    super();
  }
  
  public Student(String name, String course){
    this.name = name;
    this.course = course;
  }
  
  public String getName(){
    return this.name;
  }
  
  public void setName(String name){
    this.name = name;
  }
  
  public String getCourse(){
    return this.course;
  }
  
  public void setCourse(String course){
    this.course = course;
  }
    
}