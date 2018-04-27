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
public class CollaboratorTeacher {
    private String name ;
    private int id;
     Courses[] courses;

    public CollaboratorTeacher(String name, int id, Courses[] courses) {
        this.name = name;
        this.id = id;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Courses[] getCourses() {
        return courses;
    }

    public void setCourses(Courses[] courses) {
        this.courses = courses;
    }
    public int Salary(){
        int salary=0;
       Courses [] cor=getCourses();
       for(int i=0;i<cor.length;i++){
           switch(cor[i].getType()){
            case 1:
                salary+=1500;
                break;
            case 2:
                salary+=2000;
                break;
            default:
                salary+=0;
                break;
        }
       }
        
        return salary;
    }
    
}
