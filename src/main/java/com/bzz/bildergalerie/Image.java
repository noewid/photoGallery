package com.bzz.bildergalerie;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "images")
public class Image {
    /* ATTRIBUTES */
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "picture")
    private byte[] picture;

    /* CONSTRUCTORS */
    public Image() {}

    public Image(int id, String name, byte[] picture) {
        this.id = id;
        this.name = name;
        this.picture = picture;
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

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }
}