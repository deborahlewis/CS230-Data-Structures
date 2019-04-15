/*
 * Deborah Lewis
 * CS230: Unit 1 IP
 */
package lewisdeborahunit1v2;

import java.nio.file.Paths;
import java.io.IOException;
import java.util.Scanner;

public class LewisDeborahUnit1v2 {
    
    //declare instance of scanner
    private static Scanner input;

    public static void main(String[] args) {
        // run the test script
        TestScriptUnit1();
    }
    
    public static void TestScriptUnit1() {
        //declare instance of contributor
        LinkedData contributors = new LinkedData();
        
        //open file
        Openfile();
        
        //comma, return, or new line is delimiter
        input.useDelimiter(",|\\r\\n");
        
        //while data exists, push data from file to stack
        while (input.hasNext()) {
            contributors.Push(new Contributor(input.next(), input.next(), input.next(), input.next(), input.nextInt(), input.nextInt() ) );
        }
        //close scanner
        input.close();
        //print contributors
        System.out.println("Stack of contributors: ");
        PrintContributors(contributors);
        //pop stack once per project requirements
        contributors.Pop();
        //print conttibutors after pop
        System.out.println("Contributors after pop: ");
        PrintContributors(contributors);
    }
    
    //open csv file
    public static void Openfile() {
        
        //filename
        String file = "contributors.csv";
        
        try {
           // input = new Scanner(file);
            
            
            input = new Scanner(Paths.get(file));
            //if it cannot be opened throw error
        } catch (IOException E) {
            System.err.println("File not found.");
            System.exit(1);
        }
    }
    
    //print contributors
    public static <T> void PrintContributors(T contributors) {
        System.out.println(contributors + "\n");
    }
    
}
