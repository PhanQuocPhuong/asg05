package peopletest;

import java.util.Date;

/**
 *
 * @author Phan
 */
public class Employee extends Person{
    double salary;
    public Employee(){}
    public Employee(String t,Date n,double l){
        name=t;
        birthday=n;
        salary=l;
    }
    public double getSalary(){
        return salary;
    }
    public String toString(){
        return String.format("Name is : %s \n Birthday : %s \n Luong : %.2f",getName(),birthday.toString(),getSalary());
    }
}
