package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    private Statistics statistics;
    private int numberOfUsers;
    private int postsCount;
    private int commentsCount;
    private int averagePostsByUser;
    private int averageCommentsByUser;
    private int averagePostsByComment;

    public ForumStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public int getAveragePostsByUser() {
        return averagePostsByUser;
    }

    public int getAverageCommentsByUser() {
        return averageCommentsByUser;
    }

    public int getAveragePostsByComment() {
        return averagePostsByComment;
    }

    int numberOfUsers(){
        int result = statistics.usersNames().size();
        return result;
    }
    int postsCount() {
        int result = statistics.postsCount();
        return result;
    }
    int commentsCount() {
        int result = statistics.commentsCount();
        return result;
    }
    int averagePostsByUser(){
        if(statistics.usersNames().size()>0) {
            return statistics.postsCount() / statistics.usersNames().size();
        }
        else{
            return 0;
        }
    }
    int averageCommentsByUser(){
        if(statistics.usersNames().size()>0) {
        return statistics.commentsCount() / statistics.usersNames().size();
    }
        else{
        return 0;
    }
    }
    int averageCommentsUnderPost() {
        if (statistics.commentsCount() > 0) {
            return statistics.postsCount() / statistics.commentsCount();
        } else {
            return 0;
        }
    }
    void calculateAdvStatistics(Statistics statistics) {
        this.numberOfUsers = statistics.usersNames().size();
        this.postsCount = statistics.postsCount();
        this.commentsCount = statistics.commentsCount();
        if(statistics.usersNames().size()>0) {
            this.averagePostsByUser = statistics.postsCount() / statistics.usersNames().size();
        }
        else{
            this.averagePostsByUser = 0;
        }
        if(statistics.usersNames().size()>0) {
            this.averageCommentsByUser = statistics.commentsCount() / statistics.usersNames().size();
        }
        else{
            this.averageCommentsByUser = 0;
        }
        if(statistics.commentsCount()>0) {
            this.averagePostsByComment = statistics.postsCount() / statistics.commentsCount();
        }
        else{
            this.averagePostsByComment = 0;
        }
    }
    void showStatistics(){
        System.out.println("Forum Statistics: ");
        System.out.println("Number of users: " + numberOfUsers);
        System.out.println("Number of posts: " + postsCount);
        System.out.println("Number of comments: " + commentsCount);
        System.out.println("Average number of posts published by user : " + averagePostsByUser);
        System.out.println("Average number of comments published by user : " + averageCommentsByUser);
        System.out.println("Average number of comments under the post : " + averagePostsByComment);
    }

}
