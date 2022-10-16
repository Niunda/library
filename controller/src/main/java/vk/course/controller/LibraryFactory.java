package vk.course.controller;

import vk.course.model.Author;
import vk.course.model.Book;

import java.util.ArrayList;
import java.util.List;

public class LibraryFactory {
    public Library createLibrary(){
        Library library = new Library();
        Author tolkien = new Author("John Ronald Reuel Tolkien", 1892, "Orange Free State");
        Author jordan = new Author("Robert Jordan", 1948, "U.S.");
        Author rowling  = new Author("J. K. Rowling", 1965, "England");
        List<Book> list = new ArrayList<>();
        list.add(new Book("The Hobbit", tolkien,1937));
        list.add(new Book("Roverandom", tolkien,1925));
        list.add(new Book("The Eye of the World", jordan,1990));
        list.add(new Book("The Dragon Reborn", jordan,1991));
        list.add(new Book("Harry Potter and the Philosopher's Stone", rowling,1997));
        list.add(new Book("Harry Potter and the Order of the Phoenix", rowling,2003));
        library.bookList = list;
        return library;
    }
}
