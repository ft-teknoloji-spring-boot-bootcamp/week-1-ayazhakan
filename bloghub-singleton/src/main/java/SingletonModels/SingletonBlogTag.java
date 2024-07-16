package SingletonModels;

import model.BlogTag;

public class SingletonBlogTag {

    private static SingletonBlogTag instance;
    private BlogTag blogTag;

    private SingletonBlogTag() {
        blogTag = new BlogTag("Java");
    }

    public static SingletonBlogTag getInstance() {
        if (instance == null) {
            instance = new SingletonBlogTag();
        }
        return instance;
    }

    public BlogTag getBlogTag() {
        return blogTag;
    }

    public void setBlogTag(BlogTag blogTag) {
        this.blogTag = blogTag;
    }
}
