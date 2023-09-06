package entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.time.format.DateTimeFormatter;

public class Post {
    private LocalDateTime moment;
    private String title;
    private String content;
    private Integer likes;

    private static final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private final List<Comment> comments = new ArrayList<>();

    public Post(){
    }

    public Post(LocalDateTime moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comment> getComments(){
        return comments;
    }

    public void addComment (Comment comment){
        comments.add(comment);
    }

    public void removeComment(Comment comment){
        comments.remove(comment);
    }

    public static DateTimeFormatter getDTF(){
        return fmt;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title).append("\n");
        sb.append(String.format("%d Likes - ", getLikes()));
        sb.append(getMoment().format(fmt)).append("\n");
        sb.append(getContent()).append("\n");
        sb.append("Comments: \n");;
        for(Comment comment : getComments()){
            sb.append(comment.getComment()).append("\n");
        }
        sb.append("\n----------------------\n");
        return sb.toString();
    }
}
