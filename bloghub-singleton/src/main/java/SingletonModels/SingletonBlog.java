package SingletonModels;

import model.Blog;
import model.User;

public class SingletonBlog {

    private static SingletonBlog instance;
    private Blog blog;

    private SingletonBlog() {
        User user = SingletonUser.getInstance().getUser(); // SingletonUser'dan User örneği alınıyor
        blog = new Blog("Başlık", "İçerik", user);
    }

    public static SingletonBlog getInstance() {
        if (instance == null) {
            instance = new SingletonBlog();
        }
        return instance;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }
}
