package com.kodilla.kodillapatterns2.observer.homework;

import com.kodilla.kodillapatterns2.observer.forum.Observer;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class UserTaskQueue implements HomeworkObservable {
    private final List<HomeworkObserver> observers;
    private final ArrayDeque<String> tasks;
    private final String username;

    public UserTaskQueue(String username) {
        observers = new ArrayList<>();
        tasks = new ArrayDeque<>();
        this.username = username;
    }
    public void addTaskToQueue(String task) {
        tasks.offer(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(HomeworkObserver homeworkObserver) {
        observers.add(homeworkObserver);
    }

    @Override
    public void notifyObservers() {
        for (HomeworkObserver homeworkObserver : observers) {
            homeworkObserver.update(this);
        }
    }

    @Override
    public void removeObserver(HomeworkObserver homeworkObserver) {
        observers.remove(homeworkObserver);
    }

    public ArrayDeque<String> getTasks() {
        return tasks;
    }

    public String getUsername() {
        return username;
    }
}
