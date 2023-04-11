public class BinarySearchTree {
   Node root;

   public BinarySearchTree() {
      this.root = null;
      }

   public void addAccount(Account account) {
      Node newNode = new Node(account);

      if (root == null){
         root = newNode;
         return;
         }
         

      Node currentNode = root;

      while(true) {

         if (account.username.compareTo(currentNode.account.username)<0){
            if (currentNode.left == null){
               currentNode.left = newNode;
               return;

            } else {
                  currentNode = currentNode.left;
            }

         } else {
            if (currentNode.right == null) {
               currentNode.right = newNode;
               return;

            } else {

               currentNode = currentNode.right;
            }
            }
            }
            }
            
            public Account searchAccount(String username) {
         Node currentNode = root;

         while (currentNode != null) {

            if (username.equals(currentNode.account.username)) {
               return currentNode.account;}

            else if (username.compareTo(currentNode.account.username)<0){
               currentNode = currentNode.left;
               } else {
                  currentNode = currentNode.right;
               }
               }

               return null;
            }
            }   
            