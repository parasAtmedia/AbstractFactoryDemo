package com.media.net;

import java.util.List;

/**
 * Created by paras.a on 18/07/17.
 */
public abstract class Page {
    String aboutDetails;
    List<String> followers;

    public abstract String getAboutDetails();
    public abstract List<String> getFollowers();

    public abstract String getTypeOfPage();

    public void setAboutDetails(String aboutDetails) {
        this.aboutDetails = aboutDetails;
    }

    public void setFollowers(List<String> followers) {
        this.followers = followers;
    }
}
