package com.kodilla.stream.forumuser;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theUsers = new ArrayList<>();

    public Forum() {
        theUsers.add(new ForumUser(0001,"Mark", 'M', LocalDate.of(2000, 4, 13), 3));
        theUsers.add(new ForumUser(0002,"Emily", 'F', LocalDate.of(1990, 10, 5), 6));
        theUsers.add(new ForumUser(0003,"Whitney", 'F', LocalDate.of(1995, 8, 17), 2));
        theUsers.add(new ForumUser(0004,"Tom", 'M', LocalDate.of(1982, 3, 19), 10));
        theUsers.add(new ForumUser(0005,"Albert", 'M', LocalDate.of(2010, 7, 2), 7));
    }
    public List<ForumUser> getUsers() {
        return new ArrayList<>(theUsers);
    }
}
