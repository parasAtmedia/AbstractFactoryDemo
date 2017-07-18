package com.media.net;

/**
 * Created by paras.a on 18/07/17.
 */
public class FactoryProducer {
    public static FacebookAbstractFactory getFactory(String choice){

        if(choice.equalsIgnoreCase("PAGE")){
            return new PageFactory();

        } else if(choice.equalsIgnoreCase("POST")){
            return new PostFactory();
        }

        return null;
    }
}