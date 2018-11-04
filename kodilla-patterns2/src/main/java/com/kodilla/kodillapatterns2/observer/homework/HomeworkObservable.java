package com.kodilla.kodillapatterns2.observer.homework;

import com.kodilla.kodillapatterns2.observer.forum.Observer;

public interface HomeworkObservable {
    void registerObserver(HomeworkObserver homeworkObserver);
    void notifyObservers();
    void removeObserver(HomeworkObserver homeworkObserver);
}
