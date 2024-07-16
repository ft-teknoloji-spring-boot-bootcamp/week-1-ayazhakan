package FactoryModels;

import model.Blog;
import model.User;

public class BlogFactory {

    public Blog createBlog(String title, String text, User user) {
        return new Blog(title, text, user);
    }
}
