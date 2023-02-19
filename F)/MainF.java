public class MainF {
    public static void main(String[] args) {
        RedditFrontPage frontPage = new RedditFrontPage();

        RedditPost firstPost = new RedditPost("14/2/2023", "Battledawg55", 1, "Yo check this out");
        RedditPost newPost = new RedditPost("19/2/2023", "coderBro55", 123, "opgave F was toughhhh deewd");
        RedditPost shitPost = new RedditPost("current date", "shitPoster", 123, "damn this post is shit");

        frontPage.addPost(newPost);
        frontPage.addPost(firstPost);
        frontPage.addPost(shitPost);

        System.out.println(frontPage);

        frontPage.deletePost(2);
        System.out.println(frontPage);
    }
}
