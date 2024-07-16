package SingletonModels;

import model.BlogComment;
import model.User;

public class SingletonBlogComment {

    private static SingletonBlogComment instance;
    private BlogComment blogComment;

    private SingletonBlogComment() {
        User user = SingletonUser.getInstance().getUser(); // SingletonUser'dan User örneği alınıyor
        blogComment = new BlogComment(user, "Yorum...");
    }

    public static SingletonBlogComment getInstance() {
        if (instance == null) {
            instance = new SingletonBlogComment();
        }
        return instance;
    }

    public BlogComment getBlogComment() {
        return blogComment;
    }

    public void setBlogComment(BlogComment blogComment) {
        this.blogComment = blogComment;
    }
}
