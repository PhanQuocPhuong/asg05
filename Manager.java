
package peopletest;

import java.util.Date;

/**
 *
 * @author Phan
 */
public class Manager extends Employee{
    protected Employee Assistant;

    /**
     *
     * @param t
     * @param n
     * @param l
     */
    public Manager(String t,Date n,double l){
        name=t;
        birthday=n;
        salary=l;
    }
    public void setAssistant(Employee a){
        name=a.getName();
        birthday=a.getDate();
        salary=a.getSalary();
    }
}
