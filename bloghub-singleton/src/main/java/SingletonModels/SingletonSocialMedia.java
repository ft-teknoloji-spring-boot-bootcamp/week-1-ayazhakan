package SingletonModels;

import model.SocialMedia;

public class SingletonSocialMedia {

    private static SingletonSocialMedia instance;
    private SocialMedia socialMedia;

    private SingletonSocialMedia() {
        socialMedia = new SocialMedia("Twitter", "https://twitter.com/");
    }

    public static SingletonSocialMedia getInstance() {
        if (instance == null) {
            instance = new SingletonSocialMedia();
        }
        return instance;
    }

    public SocialMedia getSocialMedia() {
        return socialMedia;
    }

    public void setSocialMedia(SocialMedia socialMedia) {
        this.socialMedia = socialMedia;
    }
}
