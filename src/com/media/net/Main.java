package com.media.net;

public class Main {


    public static void main(String[] args) {
	// write your code here
        FacebookAbstractFactory facebookAbstractFactory = null;
        
        facebookAbstractFactory = FactoryProducer.getFactory("Page");
        TestAbstractFactory.testPageFactory(facebookAbstractFactory);

        facebookAbstractFactory = FactoryProducer.getFactory("Post");
        TestAbstractFactory.testPostFactory(facebookAbstractFactory);

        TestFactory.testPageFactory();
        TestFactory.testPostFactory();
    }
}

