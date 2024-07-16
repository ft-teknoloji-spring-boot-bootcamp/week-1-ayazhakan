package FactoryModels;

import model.BlogComment;
import model.User;

public class BlogCommentFactory {

    public BlogComment createBlogComment(User user, String comment) {
        return new BlogComment(user, comment);
    }
}
