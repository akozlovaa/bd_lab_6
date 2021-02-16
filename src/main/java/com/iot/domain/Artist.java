package com.iot.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Artist {
    private int id;
    private Integer labelId;
    private Integer bandId;
    private String name;
    private int monthlyListens;
    private int followers;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "label_id", nullable = true)
    public Integer getLabelId() {
        return labelId;
    }

    public void setLabelId(Integer labelId) {
        this.labelId = labelId;
    }

    @Basic
    @Column(name = "band_id", nullable = true)
    public Integer getBandId() {
        return bandId;
    }

    public void setBandId(Integer bandId) {
        this.bandId = bandId;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 100)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "monthly_listens", nullable = false)
    public int getMonthlyListens() {
        return monthlyListens;
    }

    public void setMonthlyListens(int monthlyListens) {
        this.monthlyListens = monthlyListens;
    }

    @Basic
    @Column(name = "followers", nullable = false)
    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }


}
