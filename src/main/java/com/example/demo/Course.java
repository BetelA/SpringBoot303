package com.example.demo;

import org.hibernate.annotations.Entity;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Entity

public class Course {
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @NotNull
    public String getTitle() {
        return title;
    }

    public void setTitle(@NotNull String title) {
        this.title = title;
    }

    @NotNull
    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(@NotNull String instructor) {
        this.instructor = instructor;
    }

    @NotNull
    public String getDescription() {
        return description;
    }

    public void setDescription(@NotNull String description) {
        this.description = description;
    }

    @NotNull
    public String getCredit() {
        return credit;
    }

    public void setCredit(@NotNull String credit) {
        this.credit = credit;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(min = 4)
    private String title;

    @NotNull
    @Size(min = 3)
    private String instructor;

    @NotNull
    @Size(min = 10)
    private String description;

    @NotNull
    @Min(3)
    private String credit;
}
