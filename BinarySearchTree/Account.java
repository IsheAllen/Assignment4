public class Account {

    protected String username;
    protected String vidDescription;
    protected String accountDescription;
    protected String numLikes;
    protected String data;
    protected String vidName;
    
    public Account(String data) {
        this.data=data;
        
        if (data.contains("Create")) 
        {
          String[] words=data.split(" ");
          for (int i=0; i<words.length; i++) {
          this.username = words[1];
          this.accountDescription=words[2];
         }
         }
        if (data.contains("Add"))
        {
           String[] words=data.split(" ");
           for (int i=0; i<words.length; i++) {
           this.username=words[1];
           this.vidName=words[2];
           this.numLikes=words[3];
           this.vidDescription=words[4];
      }
        }
        
       
     }
    
    
    
  

}