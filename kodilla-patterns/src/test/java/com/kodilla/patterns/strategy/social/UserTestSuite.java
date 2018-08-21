package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User user1 = new Millenials("user one");
        User user2 = new YGeneration("user two");
        User user3 = new ZGeneration("user three");

        //When
        String user1Share = user1.sharePost();
        System.out.println("User one shared with " + user1Share);
        String user2Share = user2.sharePost();
        System.out.println("User two shared with " + user2Share);
        String user3Share = user3.sharePost();
        System.out.println("User three shared with " + user3Share);

        //Then
        Assert.assertEquals("Facebook",user1Share);
        Assert.assertEquals("Twitter",user2Share);
        Assert.assertEquals("Snapchat",user3Share);
    }
    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User user1 = new Millenials("user one");

        //When
        String user1Share = user1.sharePost();
        System.out.println("User one shared with " + user1Share);
        user1.setSocialPublisher(new TwitterPublisher());
        user1Share = user1.sharePost();
        System.out.println("User one shared with " + user1Share);

        //Then
        Assert.assertEquals("Twitter",user1Share);
    }

}
