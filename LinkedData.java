/*
 * Deborah Lewis
 * CS230: Unit 1 IP
 */
package lewisdeborahunit1v2;
import java.util.LinkedList;

public class LinkedData <T> {
    //declare linked list
    protected LinkedList<T> contributorList;
    
    //create new linked list with constructor
    public LinkedData() {
        contributorList = new LinkedList<>();
    }
    
    //push new data into list
    public void Push(T item) {
        contributorList.push(item);
    }
    
    //pull data from list
    public T Pop() {
        T item = null;
        //if contributorList is not empty
        if (!contributorList.isEmpty()) {
            item = contributorList.pop();
        }
        return item;
    }
    //override toString for formatting
    @Override
    public String toString() {
        return contributorList.toString().replace(" ", "\n ");
    }
    
}
