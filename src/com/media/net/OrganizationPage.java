package com.media.net;

import java.util.List;

/**
 * Created by paras.a on 18/07/17.
 */
public class OrganizationPage extends Page{
    @Override
    public String getAboutDetails() {
        System.out.println("Fetching About section details of give Organization Page");

        return aboutDetails;
    }

    @Override
    public List<String> getFollowers() {
        return followers;
    }
}
