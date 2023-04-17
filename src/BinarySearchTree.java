
/**

 This class represents a Binary Search Tree data structure to store and manage Account objects.

 It has methods to insert, delete, search, and list Accounts in the tree.
 */

public class BinarySearchTree {
   private Node root;

   /**

    Inserts an Account object into the Binary Search Tree.
    @param account the Account to insert into the tree.
    */
   public void insert(Account account) {
      root = insertRecursive(root, account);
   }

   /**

    A recursive helper method for the insert method.

    @param currentNode the current node in the recursive call.

    @param account the Account to insert into the tree.

    @return the current node in the recursive call after inserting the Account.
    */

   private Node insertRecursive(Node currentNode, Account account) {
      if (currentNode == null) {
         return new Node(account);
      }

      if (account.username.compareTo(currentNode.account.username) < 0) {
         currentNode.left = insertRecursive(currentNode.left, account);
      } else {
         currentNode.right = insertRecursive(currentNode.right, account);
      }

      return currentNode;
   }

   /**

    Deletes an Account object with the given username from the Binary Search Tree.
    @param username the username of the Account to delete.
    */
   public void delete(String username) {
      root = deleteRecursive(root, username);
   }

   private Node deleteRecursive(Node currentNode, String username) {
      if (currentNode == null) {
         return null;
      }

      if (username.equals(currentNode.account.username)) {
         if (currentNode.left == null) {
            return currentNode.right;
         } else if (currentNode.right == null) {
            return currentNode.left;
         } else {
            Node minNode = findMinNode(currentNode.right);
            currentNode.account = minNode.account;
            currentNode.right = deleteRecursive(currentNode.right, minNode.account.username);
         }
      } else if (username.compareTo(currentNode.account.username) < 0) {
         currentNode.left = deleteRecursive(currentNode.left, username);
      } else {
         currentNode.right = deleteRecursive(currentNode.right, username);
      }

      return currentNode;
   }

   private Node findMinNode(Node currentNode) {
      while (currentNode.left != null) {
         currentNode = currentNode.left;
      }
      return currentNode;
   }

   /**

    Searches for an Account object with the given username in the Binary Search Tree.
    @param username the username of the Account to search for.
    @return the Account object with the given username, or null if it is not found.
    */

   public Account search(String username) {
      Node currentNode = root;
      while (currentNode != null) {
         if (username.equals(currentNode.account.username)) {
            return currentNode.account;
         } else if (username.compareTo(currentNode.account.username) < 0) {
            currentNode = currentNode.left;
         } else {
            currentNode = currentNode.right;
         }
      }
      return null;
   }
   public void listAccounts() {
      listAccounts(root);
   }

   /**
    * Lists all the accounts
    * @param currentNode
    */

   private void listAccounts(Node currentNode) {
      if(currentNode != null) {
         listAccounts(currentNode.left);
         System.out.println(currentNode.account.toString());
         listAccounts(currentNode.right);
      }
   }
}