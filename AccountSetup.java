import java.util.Scanner;
public class AccountSetup
{
    public static void main (String args [])
    {
        String pass;
        String user;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a user name: ");
        user = input.next();
        System.out.print("Enter a password that is at least 8 characters: ");
        pass = input.next();
        int len = pass.length();
        while(!(len >= 8))
        {
            System.out.print("Enter a password that is at least 8 characters: ");
            pass = input.next();
            len = pass.length();
        }
        input.close();
        System.out.println("Your use name is " + user + " and your password is " + pass);
    }
}
