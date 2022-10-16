package vk.course.model;

import lombok.Value;


@Value
public class Book {
    String title;
    Author author;
    int year;
}
