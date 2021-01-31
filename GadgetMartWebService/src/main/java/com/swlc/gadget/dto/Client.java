package com.swlc.gadget.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "client")
public class Client {

    @Id
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "company_name")
    private String companyName;
    @Column(name = "url")
    private String url;
    @Column(name = "joined_date")
    private LocalDate joinedDate;
    @Column(name = "status")
    private String status;

    public Client() {
    }

    public int getId() {
        return id;
    }

    public Client setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Client setName(String name) {
        this.name = name;
        return this;
    }

    public String getCompanyName() {
        return companyName;
    }

    public Client setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public Client setUrl(String url) {
        this.url = url;
        return this;
    }

    public LocalDate getJoinedDate() {
        return joinedDate;
    }

    public Client setJoinedDate(LocalDate joinedDate) {
        this.joinedDate = joinedDate;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public Client setStatus(String status) {
        this.status = status;
        return this;
    }
}
