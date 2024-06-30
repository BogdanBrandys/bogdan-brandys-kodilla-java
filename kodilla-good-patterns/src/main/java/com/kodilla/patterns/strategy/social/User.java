package com.kodilla.patterns.strategy.social;

public sealed class User permits Millenials, YGeneration, ZGeneration{
    private String name;
    protected SocialPublisher publisher;

    public User(String name) {
        this.name = name;
    }
    public String sharePost(){
        return publisher.share();
    }

    public void setPublisher(SocialPublisher publisher) {
        this.publisher = publisher;
    }
}
