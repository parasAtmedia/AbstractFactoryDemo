package com.media.net;

public class Main {

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
    
    public static void main(String[] args) {
	// write your code here
        FacebookAbstractFactory facebookAbstractFactory = null;
        
        facebookAbstractFactory = FactoryProducer.getFactory("Page");
        testPageFactory(facebookAbstractFactory);
        
        facebookAbstractFactory = FactoryProducer.getFactory("Post");
        testPostFactory(facebookAbstractFactory);

    }
}
