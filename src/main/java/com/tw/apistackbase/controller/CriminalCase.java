package com.tw.apistackbase.controller;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

@Entity
@Table(name = "T_CriminalCase")
public class CriminalCase {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 255)
    private String name;
    private Long time;
    @JoinColumn(name = "pid",referencedColumnName = "id")
    private CriminalCaseProfile criminalCaseprofile;

    public CriminalCase() {
    }

    public CriminalCase(Long id, String name, Long time, CriminalCaseProfile criminalCaseprofile) {
        this.id = id;
        this.name = name;
        this.time = time;
        this.criminalCaseprofile = criminalCaseprofile;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public CriminalCaseProfile getCriminalCaseprofile() {
        return criminalCaseprofile;
    }

    public void setCriminalCaseprofile(CriminalCaseProfile criminalCaseprofile) {
        this.criminalCaseprofile = criminalCaseprofile;
    }
}
