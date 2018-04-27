/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author Abdulrahman
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Courses [] course=new Courses[3];
        course[0]=new Courses("IT",1);
         course[1]=new Courses("Engilsh",2);
          course[2]=new Courses("Java",1);
          
          CollaboratorTeacher [] teacher=new CollaboratorTeacher[3];
          teacher[0]=new ContractTeacher("ahmad",556,course);
          teacher[1]=new CollaboratorTeacher("khald",5356,course);
          teacher[2]=new ContractTeacher("fahad",5536,course);
          for (int i=0;i<teacher.length;i++){
              System.out.println("the name "+teacher[i].getName().toString()+" the salary "+teacher[i].Salary());
          }
    }
    
}
