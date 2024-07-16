package FactoryModels;

import model.SocialMedia;

public class SocialMediaFactory {

    public SocialMedia createSocialMedia(String name, String url) {
        return new SocialMedia(name, url);
    }
}

