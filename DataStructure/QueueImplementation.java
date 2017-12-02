import java.util.LinkedList;

/**
 * Created by enes on 11/10/2017.
 */

class GenQueue<E> {
    private LinkedList<E> list = new LinkedList<>();
    public void enqueue(E item){
        list.addLast(item);
    }
    public E dequeue(){
        return list.poll();
    }
    public boolean hasItems(){
        return !list.isEmpty();
    }
    public int size(){
        return list.size();
    }
    public void addItems(GenQueue<? extends E> q){
        while(q.hasItems()) list.addLast(q.dequeue());
    }
}

public class GenQueueTest {
    public static void main(String[] args) {
        GenQueue<Employee> emplist;
        emplist = new GenQueue<Employee>();
        GenQueue<HourlyEmployee> hlist;

        hlist = new GenQueue<HourlyEmployee>();
        hlist.enqueue(new HourlyEmployee("T","D"));
        hlist.enqueue(new HourlyEmployee("G","B"));
        hlist.enqueue(new HourlyEmployee("F","S"));
        emplist.addItems(hlist);
        System.out.println("The employees' names are: ");

        while (emplist.hasItems()){
            Employee emp = emplist.dequeue();
            System.out.println(emp.firstName + " " + emp.lastname);
        }
    }
}
class Employee{
    public String lastName;
    public String firstName;
    public Employee(){
    }
    public Employee(String last, String first){
        this.lastName = last;
        this.firstName=first;
    }

    public String toString(){
        return firstName + " " + lastName;
    }
}
class HourlyEmployee extends Employee{
    public double hourlyRate;
    public HourlyEmployee(String last, String first){
        super(last,first);
    }
}
