package com.media.net;

/**
 * Created by paras.a on 19/07/17.
 */
public class TestFactory {

    static void testPostFactory(){
        Post post = null;

        PostFactory postFactory = new PostFactory();
        post = postFactory.getPost("News");
        post.submitPost();

        post = postFactory.getPost("Image");
        post.submitPost();

        post = postFactory.getPost("Video");
        post.submitPost();
    }

    static void testPageFactory(){
        Page page = null;

        PageFactory pageFactory = new PageFactory();
        page = pageFactory.getPage("Community");
        page.getAboutDetails();

        page = pageFactory.getPage("PublicFigure");
        page.getAboutDetails();

        page = pageFactory.getPage("Organization");
        page.getAboutDetails();
    }
}
