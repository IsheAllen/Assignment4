/**

 The Post class represents a social media post with a video name, number of likes and a post description.
 */
public class Post {
    public String videoName;
    public int numLikes;
    public String postDescription;

    /**

     Constructs a new Post object with the specified video name, number of likes and post description.
     @param videoName The name of the video associated with the post.
     @param numLikes The number of likes the post has received.
     @param postDescription The description associated with the post.
     */
    public Post(String videoName, int numLikes, String postDescription) {
        this.videoName = videoName;
        this.numLikes = numLikes;
        this.postDescription = postDescription;
    }

    public int getNumLikes() {
        return numLikes;
    }

    @Override
    public String toString() {
        return "Post{" +
                "videoName='" + videoName + '\'' +
                ", numLikes=" + numLikes +
                ", postDescription='" + postDescription + '\'' +
                '}';
    }
}