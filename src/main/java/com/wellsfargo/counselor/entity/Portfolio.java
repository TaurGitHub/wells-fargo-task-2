package com.wellsfargo.counselor.entity;

import org.hibernate.annotations.ForeignKey;
import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private Date creationDate;

    @OneToMany
    @JoinColumn(name = "clientID", nullable = false)
    private long clientID;

    protected Portfolio() {

    }

    public Portfolio(Date creationDate, long clientID){
        this.creationDate = creationDate;
        this.clientID = clientID;
    }

    public long getPortfolioID () {
        return portfolioId;
    }

    public long getClientId() {
        return clientID;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
