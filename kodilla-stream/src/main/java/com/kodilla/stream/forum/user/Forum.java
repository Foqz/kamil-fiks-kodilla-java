package com.kodilla.stream.forum.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    public static List<ForumUser> getUserList(){
        final List<ForumUser> theList = new ArrayList<>();
        theList.add(new ForumUser(1111,"User1",'M',LocalDate.of(2000,12,20),3));
        theList.add(new ForumUser(2222,"User2",'M',LocalDate.of(1992,1,13),20));
        theList.add(new ForumUser(3333,"User3",'F',LocalDate.of(1984,4,7),10));
        theList.add(new ForumUser(4444,"User4",'F',LocalDate.of(2001,5,5),11));
        theList.add(new ForumUser(5555,"User5",'M',LocalDate.of(1980,1,1),0));
        theList.add(new ForumUser(6666,"User6",'M',LocalDate.of(1995,2,11),15));
        theList.add(new ForumUser(7777,"User7",'F',LocalDate.of(2005,3,22),3));
        theList.add(new ForumUser(8888,"User8",'F',LocalDate.of(1970,4,28),0));
        return new ArrayList<>(theList);
    }

}
