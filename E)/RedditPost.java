import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RedditPost {

    private String date;
    private String author;
    private int voteBalance = 1;

    private String title;

    public RedditPost(String date, String author, int voteBalance, String title) {
        this.date = getDate();
        this.author = author;
        this.voteBalance = getVoteBalance();
        this.title = title;
    }

    public String getDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String currentDate = dtf.format(now);
        return currentDate;
    }

    public String getAuthor() {
        return author;
    }

    public int getVoteBalance() {
        return voteBalance;
    }

    public String getTitle() {
        return title;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setVoteBalance(int voteBalance) {
        this.voteBalance = voteBalance;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "RedditPost{" +
                "date='" + date + '\'' +
                ", author='" + author + '\'' +
                ", voteBalance=" + voteBalance +
                ", title='" + title + '\'' +
                '}';
    }
}
