package vk.course.controller;

import vk.course.model.Book;

import java.util.List;


public class Library {
    List<Book> bookList;

    public void addBook(Book book){
        bookList.add(book);
    }
}
