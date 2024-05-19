package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Objects;

public class ForumUser {
    private final int userID;
    private final String userName;
    private final char sex;
    private final LocalDate birthday;
    private final int publishedPosts;

    public ForumUser(final int userID, final String userName, final char sex, final LocalDate birthday, final int publishedPosts) {
        this.userID = userID;
        this.userName = userName;
        this.sex = sex;
        this.birthday = birthday;
        this.publishedPosts = publishedPosts;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getPublishedPosts() {
        return publishedPosts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumUser forumUser = (ForumUser) o;
        return userID == forumUser.userID && sex == forumUser.sex && publishedPosts == forumUser.publishedPosts && Objects.equals(userName, forumUser.userName) && Objects.equals(birthday, forumUser.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userID, userName, sex, birthday, publishedPosts);
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", publishedPosts=" + publishedPosts +
                '}';
    }
}

