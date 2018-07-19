package com.kodilla.stream.forum.user;

import java.time.LocalDate;
import java.util.Objects;

public final class ForumUser {
    private final int userId;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private final int postAmount;

    public ForumUser(final int userId,final String userName,final char sex,final LocalDate birthDate,final int postAmount) {
        this.userId = userId;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = birthDate;
        this.postAmount = postAmount;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostAmount() {
        return postAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumUser forumUser = (ForumUser) o;
        return userId == forumUser.userId &&
                sex == forumUser.sex &&
                postAmount == forumUser.postAmount &&
                Objects.equals(userName, forumUser.userName) &&
                Objects.equals(birthDate, forumUser.birthDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(userId, userName, sex, birthDate, postAmount);
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", postAmount=" + postAmount +
                '}';
    }
}
