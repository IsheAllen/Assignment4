import java.util.Scanner;
public class TokTik
{
    public static void main(String[] args)
    {

    Scanner input = new Scanner(System.in);
    int choice;

    do{
        System.out.print("Choose an action from the menu: \n");
        System.out.print("1. Find the profile description for a given account \n");
        System.out.print("2. List all accounts \n");
        System.out.print("3. Create an account \n");
        System.out.print("4. Delete an account \n");
        System.out.print("5. Delete all posts for a single account \n");
        System.out.print("6. Add a new post for an account \n");
        System.out.print("7. Load a file of actions from disk and process this \n");
        System.out.print("8. Quit \n");

        System.out.print("Enter your choice:");
        choice = input.nextInt();


        if (choice==1)
        {
            String AccountName;
            System.out.print("Enter the account name:");
            AccountName = input.next();

            BinarySearchTree tree = new BinarySearchTree();

       Account NameOfAccount= tree.searchAccount(AccountName);
            System.out.println("The profile description is: " + NameOfAccount.accountDescription);
        }


    } while (choice != 8);
    }
    }