package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclassifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;

import java.util.*;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    public int publicationYearMedian(Set<Book> bookSet){
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book> bookMap = new HashMap<>();
        for (Book book : bookSet) {
            bookMap.put(new BookSignature(book.getSignature()), new com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book(
                    book.getAuthor(),
                    book.getTitle(),
                    book.getPublicationYear()));
        }
        return medianPublicationYear(bookMap);
    }
}
