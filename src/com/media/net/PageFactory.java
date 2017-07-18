package com.media.net;

/**
 * Created by paras.a on 18/07/17.
 */
public class PageFactory extends FacebookAbstractFactory {
    @Override
    public Page getPage(String typeOfPage) {
        if(typeOfPage.equalsIgnoreCase("PublicFigure")){
            return new PublicFigurePage();
        }
        else if(typeOfPage.equalsIgnoreCase("Organization")){
            return new OrganizationPage();
        }
        else if(typeOfPage.equalsIgnoreCase("Community")){
            return new CommunityPage();
        }

        return null;
    }

    @Override
    public Post getPost(String typeOfPost) {
        return null;
    }
}
