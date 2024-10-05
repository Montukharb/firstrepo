
//import library and classes
import java.util.Scanner;

public class Loops {
    public static void main(String args[]) {
        System.out.println("hello java whats happening");
        SubLoops obj = new SubLoops();
        obj.Calculation();
    }
}

class SubLoops {
    public void Calculation() {
        System.out.println("Enter value");
        Scanner Sobj = new Scanner(System.in);

        int input = Sobj.nextInt();
        System.out.println("Total value: " + input);

        do {
            System.out.println("Current Value is:" + input);
            input--;
        } while (input != 0);
        Sobj.close();
    }
}