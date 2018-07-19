package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forum.user.Forum;
import com.kodilla.stream.forum.user.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Map<Integer, Object> theResultMapOfUsers = Forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex()=='M')
                .filter(forumUser -> forumUser.getBirthDate().getYear() <= 1998)
                .filter(forumUser -> forumUser.getPostAmount() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserId,forumUser -> forumUser));
        theResultMapOfUsers.entrySet().stream()
                .map(integerObjectEntry -> integerObjectEntry.getKey() + ": " +integerObjectEntry.getValue())
                .forEach(System.out::println);
    }
}