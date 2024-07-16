import hw1.BlogStatistic;
import hw1.PasswordHasher;
import model.Blog;
import model.User;
import model.enums.BlogStatus;
import model.enums.StatusType;
import repository.BlogRepository;
import repository.UserRepository;
import service.BlogService;
import service.UserService;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class Main {





    public static void main(String[] args) {

        UserService userService = new UserService(new UserRepository());

        BlogService blogService = new BlogService(new BlogRepository(), userService);

        userService.saveUser("cem@gmail.com","password");
        userService.saveUser("mehmet@gmail.com", "123456");
        userService.saveUser("hakan@gmail.com", "123456");
        userService.changeStatus("cem@gmail.com", StatusType.APPROVED);
        userService.changeStatus("mehmet@gmail.com", StatusType.APPROVED);
        userService.changeStatus("hakan@gmail.com", StatusType.APPROVED);
        userService.getAllUsers().forEach(System.out::println);
        User foundUser = userService.getUserByEmail("cem@gmail.com");


        blogService.createBlog("başlık", "içerik", "cem@gmail.com");
        blogService.createBlog("deneme", "deneme12", "hakan@gmail.com");
        blogService.changeBlogStatus(BlogStatus.PUBLISHED,"deneme");
        userService.getAllUsers().forEach(System.out::println);

        Blog foundBlog = blogService.getBlogByTitle("başlık");

        blogService.addComment("başlık", "çok kötü olmuş", foundUser);

        userService.getAllUsers()
                .stream()
                .filter(user -> user.getName().equals("Cem"))
                .findFirst()
                .ifPresent(user -> System.out.println("Cem adlı kullanıcının aldığı blog sayısı: " + user.getBlogList().size()));

        BlogStatistic.printBlogStatistics(userService.getAllUsers()
                .stream()
                .filter(user -> user.getName().equals("Cem"))
                .findFirst()
                .map(User::getBlogList)
                .orElseThrow());
    }
}
