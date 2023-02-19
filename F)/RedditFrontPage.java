import java.util.ArrayList;

public class RedditFrontPage {

   private ArrayList<RedditPost> frontPageArray;

    public RedditFrontPage() {
        frontPageArray = new ArrayList<>();
    }

    public void addPost(RedditPost post) {
        frontPageArray.add(post);
    }

    public void deletePost(int index) {
        frontPageArray.remove(index);
    }

    @Override
    public String toString() {
        return "RedditFrontPage{" +
                "frontPageArray=\n" + frontPageArray +
                "}";
    }
}
