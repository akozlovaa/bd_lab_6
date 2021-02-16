package com.iot.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Band {
    private int id;
    private String name;
    private Integer numOfArtists;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "num_of_artists", nullable = true)
    public Integer getNumOfArtists() {
        return numOfArtists;
    }

    public void setNumOfArtists(Integer numOfArtists) {
        this.numOfArtists = numOfArtists;
    }


}
