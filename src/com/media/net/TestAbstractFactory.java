package com.media.net;

/**
 * Created by paras.a on 19/07/17.
 */
public class TestAbstractFactory {

    static void testPostFactory(FacebookAbstractFactory facebookAbstractFactory){
        Post post = null;

        post = facebookAbstractFactory.getPost("News");
        post.submitPost();

        post = facebookAbstractFactory.getPost("Image");
        post.submitPost();

        post = facebookAbstractFactory.getPost("Video");
        post.submitPost();
    }

    static void testPageFactory(FacebookAbstractFactory facebookAbstractFactory){
        Page page = null;

        page = facebookAbstractFactory.getPage("Community");
        page.getAboutDetails();

        page = facebookAbstractFactory.getPage("PublicFigure");
        page.getAboutDetails();

        page = facebookAbstractFactory.getPage("Organization");
        page.getAboutDetails();
    }

}
