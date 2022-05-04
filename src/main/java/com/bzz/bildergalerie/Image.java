package com.bzz.bildergalerie;

import javax.persistence.*;

@Entity
@Table(name = "images")
public class Image {
    /* ATTRIBUTES */
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "link")
    private String link;

    /* CONSTRUCTORS */
    public Image() {}

    public Image(int id, String name, String link) {
        this.id = id;
        this.name = name;
        this.link = link;
    }

    /* GETTERS & SETTERS */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}