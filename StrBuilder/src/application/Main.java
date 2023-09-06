package application;

import entities.Comment;
import entities.Post;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = Post.getDTF();

        List<Post> posts = new ArrayList<>();

        System.out.print("How many Posts are you going to create? ");
        int postNum = sc.nextInt();
        sc.nextLine();

        for(int i=0 ; i < postNum ; i++){
            System.out.printf("%nStarting comment #%d:%n",i+1);
            System.out.print("Type Tittle: ");
            String title = sc.nextLine();

            System.out.print("Type content: ");
            String content = sc.nextLine();

            System.out.print("Type likes: ");
            Integer likes = sc.nextInt();
            sc.nextLine();

            System.out.print("Type the date (dd/MM/yyyy HH:mm:ss): ");
            LocalDateTime date = LocalDateTime.parse(sc.nextLine(),fmt);

            Post post = new Post(date, title, content,likes);
            posts.add(post);

            System.out.print("How many comments are you going to add? ");
            int comNum = sc.nextInt();
            sc.nextLine();

            for(int j=0 ; j < comNum ; j++){
                System.out.printf("Type comment #%d:%n",j+1);
                String commentText = sc.nextLine();
                Comment comment = new Comment(commentText);
                posts.get(i).addComment(comment);
            }
        }

        System.out.println("\n----------------------\n");

        for (Post post : posts){
            System.out.println(post.toString());;
        }
        sc.close();
    }
}