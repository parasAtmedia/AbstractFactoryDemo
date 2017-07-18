package com.media.net;

/**
 * Created by paras.a on 18/07/17.
 */
public abstract class FacebookAbstractFactory {

    public abstract Page getPage(String typeOfPage);
    public abstract Post getPost(String typeOfPost);

}
