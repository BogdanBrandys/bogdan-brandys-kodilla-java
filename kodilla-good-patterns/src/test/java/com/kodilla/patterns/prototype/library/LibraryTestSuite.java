package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class LibraryTestSuite {

    @Test
    public void testGetBooks(){
        //Given
        //creating some books
        Book book1 = new Book("Do Androids Dream of Electric Sheep?", "Philip K. Dick", LocalDate.of(1974,1,1));
        Book book2 = new Book("Stories of Your Life and Others", "Ted Chiang", LocalDate.of(2002,1,1));
        Book book3 = new Book("Sos the Rope", "Anthony Piers", LocalDate.of(1968,1,1));
        //creating library and adding books
        Library library = new Library("Favourite sci-fi");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        //When
        //making a shallow copy of object library
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Copy of my Favourite sci-fi list");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object library
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Deep Copy of my Favourite sci-fi list");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //deleting element from clonedLibrary (removed from library and cloned library)
        clonedLibrary.getBooks().remove(book3);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        assertEquals(2, library.getBooks().size());
        assertEquals(2, clonedLibrary.getBooks().size());
        assertEquals(3, deepClonedLibrary.getBooks().size());
        assertEquals(clonedLibrary.getBooks(), library.getBooks());
        assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}
