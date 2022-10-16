package vk.course.controller;

import com.google.gson.Gson;
import vk.course.model.Book;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        String author;
        if(args.length == 0) author = "";
        author = Arrays.stream(args).reduce((x, y) -> x+" "+y).get();
        LibraryFactory factory = new LibraryFactory();
        Library library = factory.createLibrary();
        Gson gson = new Gson();
        for (Book book: library.bookList) {
            if (book.getAuthor().getFullName().equals(author))
                System.out.println(gson.toJson(book));
        }
    }
}
