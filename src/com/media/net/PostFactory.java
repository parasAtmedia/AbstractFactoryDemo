package com.media.net;

/**
 * Created by paras.a on 18/07/17.
 */
public class PostFactory extends FacebookAbstractFactory {
    @Override
    public Page getPage(String typeOfPage) {
        return null;
    }

    @Override
    public Post getPost(String typeOfPost) {
        if (typeOfPost.equalsIgnoreCase("News")){
            return new NewsPost();
        }
        else if(typeOfPost.equalsIgnoreCase("Image")){
            return new ImagePost();
        }
        else if(typeOfPost.equalsIgnoreCase("Video")){
            return new VideoPost();
        }

        return null;
    }
}
