import SingletonModels.*;
import model.*;
import model.enums.BlogStatus;
import model.enums.StatusType;
import repository.BlogRepository;
import repository.UserRepository;
import service.BlogService;
import service.UserService;

import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        User user = SingletonUser.getInstance().getUser();
        System.out.println("User: " + user.getName() + ", " + user.getEmail());

        Blog blog = SingletonBlog.getInstance().getBlog();
        System.out.println("Blog: " + blog.getTitle() + ", " + blog.getText());

        BlogComment comment = SingletonBlogComment.getInstance().getBlogComment();
        System.out.println("Blog Comment: " + comment.getComment());

        BlogTag tag = SingletonBlogTag.getInstance().getBlogTag();
        System.out.println("Blog Tag: " + tag.getTag());

        SocialMedia socialMedia = SingletonSocialMedia.getInstance().getSocialMedia();
        System.out.println("Social Media: " + socialMedia.getName() + ", " + socialMedia.getUrl());

    }
}
