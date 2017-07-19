package com.media.net;//

// Created by sabarinath.ha on 19/07/17.
//
class RestrictedFB {

    private Page page1;
    private Page page2;
    private Post postType1;
    private Post postType2;

    RestrictedFB(){

        // WITHOUT ABSTRACT FACTORIES

        page1 = new CommunityPage();
        page2 = new OrganizationPage();

        postType1 = new NewsPost();
        postType2 = new ImagePost();
    }
    
    RestrictedFB(String[] permittedPages, String[] permittedPosts) {

        // WITH ABSTRACT FACTORY

        FacebookAbstractFactory pageFactory = FactoryProducer.getFactory("Page");
        FacebookAbstractFactory postFactory = FactoryProducer.getFactory("Post");
        page1 = pageFactory.getPage(permittedPages[0]);
        page2 = pageFactory.getPage(permittedPages[1]);

        postType1 = postFactory.getPost(permittedPosts[0]);
        postType2 = postFactory.getPost(permittedPosts[1]);
    }

    public String getPageList(){
        return this.page1.getPageName() + this.page2.getPageName();
    }

    public String getPostList(){
        return this.postType1.getPostName() + this.postType2.getPostName();
    }
}

public class RestrictedFacebook{
    public static void main(String[] args) {
        String[] PERMITTED_PAGES = {"COMMUNITY", "ORGANIZATION"};
        String[] PERMITTED_POSTS = {"IMAGE", "NEWS"};
        RestrictedFB restrictedFB = new RestrictedFB();
        RestrictedFB restrictedFB1 = new RestrictedFB(PERMITTED_PAGES, PERMITTED_POSTS);
    }
}
