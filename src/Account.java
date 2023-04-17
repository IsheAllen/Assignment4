import java.util.ArrayList;
import java.util.List;

public class Account {
    protected String username;
    protected String vidDescription;
    protected String accountDescription;
    protected int numLikes;
    protected String data;
    protected String vidName;

    public List<Post> posts;

    /**

     Constructs a new Account object with the given username and account description.
     The posts list is initialized as an empty ArrayList.
     @param username The username of the account.
     @param accountDescription The description of the account.
     */
    public Account(String username, String accountDescription) {
        this.username = username;
        this.accountDescription = accountDescription;
        this.posts = new ArrayList<>();
    }

    /**

     Adds a Post object to the user's list of posts.
     @param post The Post object to add.
     */

    public void addPost(Post post) {
        this.posts.add(post);
    }
    public String getUsername() {
        return username;
    }

    public String getAccountDescription() {
        return accountDescription;
    }

    public String getVidDescription() {
        return vidDescription;
    }

    public int getNumLikes() {
        return numLikes;
    }

    public String getData() {
        return data;
    }

    public String getVidName() {
        return vidName;
    }

    public void setDescription(String accountDescription) {
        this.accountDescription = accountDescription;
    }

    public void setVidDescription(String vidDescription) {
        this.vidDescription = vidDescription;
    }

    public void setNumLikes(int numLikes) {
        this.numLikes = numLikes;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setVidName(String vidName) {
        this.vidName = vidName;
    }


    public Post getPostWithMostLikes() {
        if (posts.isEmpty()) {
            return null;
        }

        Post postWithMostLikes = posts.get(0);
        for (Post post : posts) {
            if (post.getNumLikes() > postWithMostLikes.getNumLikes()) {
                postWithMostLikes = post;
            }
        }
        return postWithMostLikes;
    }


    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", accountDescription='" + accountDescription + '\'' +
                ", vidDescription='" + vidDescription + '\'' +
                ", numLikes='" + numLikes + '\'' +
                ", data='" + data + '\'' +
                ", vidName='" + vidName + '\'' +
                '}';
    }
}
