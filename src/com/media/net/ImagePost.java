package com.media.net;

/**
 * Created by paras.a on 18/07/17.
 */
public class ImagePost extends Post {
    @Override
    public void submitPost() {
        System.out.println("Image Post Submitted on your wall!");
    }

    public String getTypeOfPost() {
        return "Image Post";
    }
}
