package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void testPublicationYearMedian() {
        // Given
        Set<Book> books = new HashSet<>();
        books.add(new Book("Stephen King", "The Shinning", 1980, "6745"));
        books.add(new Book("Philip K. Dick", "Do Androids Dream of Electric Sheep?", 1968, "9831"));
        books.add(new Book("Anthony Piers", "Sos the Rope", 1968, "7639"));
        books.add(new Book("Dean Ray Koontz", "Ashley Bell", 2015, "7395"));
        MedianAdapter adapter = new MedianAdapter();
        // When
        int yearMedian = adapter.publicationYearMedian(books);
        // Then
        System.out.println(yearMedian);
        assertEquals(1980, yearMedian, 0);
    }
}
