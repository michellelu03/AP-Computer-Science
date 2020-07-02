class Student{
  private String first, last;
  private int grade, id;
  private double GPA;
  private static int num;
  
  public Student(){
    this("None", "None", 0, 0.0);
  }
  
  public Student(String firstName, String lastName, int gradeLevel, double gpa){
    num++;
    id = num;
    
    first = firstName;
    last = lastName;
    
    if(gradeLevel >= 0 && gradeLevel <= 12){
      grade = gradeLevel;
    }else
      grade = 0;
    
    if(gpa >= 0 && gpa <= 4.5){
      GPA = gpa;
    }else
      GPA = 0.0;
 
    
  }
  
  
  public String toString(){
    return last + ", " + first + "\nGPA: " + gpa + "\nGrade Level: " + grade + " id # " + id;
  }
}
