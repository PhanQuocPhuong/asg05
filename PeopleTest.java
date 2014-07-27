package peopletest;
import java.util.Date;
/**
 *
 * @author Phan
 */
public class PeopleTest {
    public static void main(String[] args) {
        Employee A = new Employee("A", new Date(89,10,2), 2000000);
        System.out.println("Employee new :\n"+A.toString());
        
        Manager B = new Manager("B", new Date(79,2,23), 40000000);
        System.out.println("Manager Mana :\n"+B.toString());                        
       
        Manager C = new Manager("C", new Date(69,3,12), 100000000);
        System.out.println("Manager C :\n"+C.toString());
        
        Person n[]=new Person[3];
        n[0]= new  Employee("D", new Date(89,10,2), 2000000);
        n[1]=new Manager("E", new Date(79,2,25), 40000000);
        n[2]= new Manager("F", new Date(69,3,12), 100000000);
        for(int i=0;i<n.length;i++)
            System.out.println (n[i].toString());
        
        
    }
}