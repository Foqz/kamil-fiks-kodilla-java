package com.kodilla.kodillapatterns2.observer.homework;

public class Mentor implements HomeworkObserver {
    private final String username;
    private int updateCount;

    public Mentor(String username) {
        this.username = username;
    }

    @Override
    public void update(UserTaskQueue userTaskQueue) {
        System.out.println(username + ": New Tasks from student :" + userTaskQueue.getUsername() + "\n"
        +"total: " + userTaskQueue.getTasks().size() + " tasks in queue");
        updateCount++;
    }

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
