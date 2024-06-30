package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        Millenials user1 = new Millenials("Tom");
        YGeneration user2 = new YGeneration("Mark");
        ZGeneration user3 = new ZGeneration("Jennifer");
        //When
        String textFacebook = user1.sharePost();
        String textTwitter = user2.sharePost();
        String textSnapchat = user3.sharePost();
        //Then
        assertEquals("Facebook", textFacebook);
        assertEquals("Twitter", textTwitter);
        assertEquals("Snapchat", textSnapchat);
    }
    @Test
    public void testIndividualSharingStrategy() {
        //Given
        Millenials user1 = new Millenials("Tom"); //facebook
        YGeneration user2 = new YGeneration("Mark"); //twitter
        ZGeneration user3 = new ZGeneration("Jennifer"); //snapchat
        //When
        //changing sharing strategy
        user1.setPublisher(new TwitterPublisher());
        user2.setPublisher(new SnapchatPublisher());
        user3.setPublisher(new FacebookPublisher());
        //Then
        assertEquals("Twitter", user1.sharePost());
        assertEquals("Snapchat", user2.sharePost());
        assertEquals("Facebook", user3.sharePost());
    }
}
