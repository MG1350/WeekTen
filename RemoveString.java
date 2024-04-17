import java.util.Scanner;
public class RemoveString
{
    public static void main (String args [])
    {
        String sent;
        String string;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        sent = input.nextLine();
        System.out.print("Enter a string: ");
        string = input.next();
        input.close();
        sent = sent.replaceAll(string, "");
        sent = sent.trim();
        System.out.println(sent);
        
    }
}
