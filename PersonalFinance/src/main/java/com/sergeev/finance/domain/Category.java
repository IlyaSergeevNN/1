package com.sergeev.finance.domain;

import javax.persistence.*;

@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String nameCategory;
    private String type;
    private int priority;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User userID;

    public Category() {
    }

    public Category(String nameCategory, String type, int priority) {
        this.nameCategory = nameCategory;
        this.type = type;
        this.priority = priority;
    }

    public Category(String nameCategory, String type, int priority, User userID) {
        this.nameCategory = nameCategory;
        this.type = type;
        this.priority = priority;
        this.userID = userID;
    }

    public Integer getId() {
        return id;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
