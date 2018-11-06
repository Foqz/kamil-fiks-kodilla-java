package com.kodilla.kodillapatterns2.adapter.bookclassifier;

import com.kodilla.kodillapatterns2.adapter.bookclassifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest(){
        //Given
        Book book1 = new Book("Author1","Title1",1950,"123");
        Book book2 = new Book("Author2","Title2",1990,"345");
        Book book3 = new Book("Author3","Title3",2000,"678");
        HashSet<Book> bookHashSet = new HashSet<>();
        bookHashSet.add(book1);
        bookHashSet.add(book2);
        bookHashSet.add(book3);
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int median = medianAdapter.publicationYearMedian(bookHashSet);
        //Then
        System.out.println(median);
        assertEquals(median,1990);

    }
}
