package FactoryModels;

import model.BlogTag;

public class BlogTagFactory {

    public BlogTag createBlogTag(String tag) {
        return new BlogTag(tag);
    }
}
