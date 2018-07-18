package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;

public class CalculateStatistics {
    private int averageUserPost;
    private int averageUserComment;
    private int averageCommentPost;

    private Statistics statistics;
    public CalculateStatistics(Statistics statistics){
        this.statistics = statistics;
    }
    public void calculateAdvStatistics(Statistics statistics) {
        if (statistics.usersNames() == null) {
            averageUserPost = 0;
            averageUserComment = 0;
            averageCommentPost = 0;
        } else if (statistics.postsCount() > 0 && statistics.commentsCount() > 0) {
            averageUserPost = statistics.postsCount() / statistics.usersNames().size();
            averageUserComment = statistics.commentsCount() / statistics.usersNames().size();
            averageCommentPost = statistics.commentsCount() / statistics.postsCount();
        } else if (statistics.postsCount() > 0 && statistics.commentsCount() == 0) {
            averageUserPost = statistics.postsCount() / statistics.usersNames().size();
            averageUserComment = 0;
            averageCommentPost = 0;
        } else if (statistics.postsCount() == 0 && statistics.commentsCount() > 0) {
            averageUserPost = 0;
            averageUserComment = statistics.commentsCount() / statistics.usersNames().size();
            averageCommentPost = 0;
        }
    }
    public void showStatistics(){
        System.out.println("Average posts per user: " + averageUserPost);
        System.out.println("Average comments per user: " + averageUserComment);
        System.out.println("Average comments per post: " + averageCommentPost);
    }

    public Integer getAverageUserPost() {
        return averageUserPost;
    }

    public Integer getAverageUserComment() {
        return averageUserComment;
    }

    public Integer getAverageCommentPost() {
        return averageCommentPost;
    }
}

