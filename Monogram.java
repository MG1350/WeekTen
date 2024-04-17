import java.util.Scanner;
public class Monogram
{
    public static void main (String args [])
    {
        String first;
        String middle;
        String last;
        Scanner input = new Scanner(System.in);
        System.out.print("First Name: ");
        first = input.next();
        System.out.print("Middle Name: ");
        middle = input.next();
        System.out.print("Last Name: ");
        last = input.next();
        input.close();
        first = first.substring(0,1);
        middle = middle.substring(0,1);
        last = last.substring(0,1);
        System.out.print("Monogram: " + first.toLowerCase() + middle.toUpperCase() + last.toLowerCase()  );
    }
}
