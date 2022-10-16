package vk.course.model;

import lombok.*;


@Value
public class Author {
    private String fullName;
    @ToString.Exclude
    private int yearOfBirth;
    @ToString.Exclude
    private String countryOfBirth;
}
