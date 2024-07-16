package hw1;

import model.Blog;

import java.util.Comparator;
import java.util.List;

public class BlogStatistic {
    public static void printBlogStatistics(List<Blog> blogs) {
        System.out.println("oluşturulma tarihine göre:");
        blogs.stream()
                .sorted(Comparator.comparing(Blog::getCreatedDate))
                .forEach(blog -> System.out.println(blog.getTitle() + " - " + blog.getCreatedDate()));


        System.out.println("\nyorum sayısına göre:");
        blogs.stream()
                .sorted(Comparator.comparing(blog -> blog.getBlogCommentList().size()))
                .forEach(blog -> System.out.println(blog.getTitle() + " - Yorum sayısı: " + blog.getBlogCommentList().size()));

        // Blogların okunma sayısına göre sıralanması (örnek olarak likeCount kullanıldı)
        System.out.println("\nokunma sayısına göre:");
        blogs.stream()
                .sorted(Comparator.comparing(Blog::getLikeCount))
                .forEach(blog -> System.out.println(blog.getTitle() + " - Okunma sayısı: " + blog.getLikeCount()));
    }
}
