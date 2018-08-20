package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Board;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Library number 1");
        Book book1 = new Book("Book1", "Author1", LocalDate.of(1991, 2, 12));
        Book book2 = new Book("Book2", "Author2", LocalDate.of(1994, 12, 5));
        Book book3 = new Book("Book3", "Author3", LocalDate.of(1997, 10, 23));
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library number 2");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library number 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //when
        library.getBooks().remove(book2);

        //then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(2,library.getBooks().size());
        Assert.assertEquals(2,clonedLibrary.getBooks().size());
        Assert.assertEquals(3,deepClonedLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(),library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(),library.getBooks());
    }
}
