import FactoryModels.*;
import model.*;

public class Main {

    public static void main(String[] args) {
        UserFactory userFactory = new UserFactory();
        User user = userFactory.createUser("Hakan Ayaz", "hakanayaz9844@outlook.com", "password");

        // BlogFactory üzerinden Blog örneği oluşturma
        BlogFactory blogFactory = new BlogFactory();
        Blog blog = blogFactory.createBlog("Başlık", "İçerik", user);

        // BlogCommentFactory üzerinden BlogComment örneği oluşturma
        BlogCommentFactory commentFactory = new BlogCommentFactory();
        BlogComment comment = commentFactory.createBlogComment(user, "Deneme");

        // BlogTagFactory üzerinden BlogTag örneği oluşturma
        BlogTagFactory tagFactory = new BlogTagFactory();
        BlogTag tag = tagFactory.createBlogTag("Java");

        // SocialMediaFactory üzerinden SocialMedia örneği oluşturma
        SocialMediaFactory socialMediaFactory = new SocialMediaFactory();
        SocialMedia socialMedia = socialMediaFactory.createSocialMedia("GitHub", "https://github.com/");

        // Oluşturulan örneklerin kullanımı
        System.out.println(user);
        System.out.println(blog);
        System.out.println(comment);
        System.out.println(tag);
        System.out.println(socialMedia);

    }
}
