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
public class ContractTeacher extends CollaboratorTeacher{
    
    public ContractTeacher(String name, int id, Courses[] courses) {
        super(name, id, courses);
    }

    @Override
    public int Salary() {
        int salary=5000;
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
