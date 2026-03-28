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
public class Security {

    @Id
    @GeneratedValue()
    private long securityId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private Float purchasePrice;

    @Column(nullable = false)
    private Date purchaseDate;

    @Column(nullable = false)
    private long quantity;

    @OneToMany
    @JoinColumn(name = "portfolioID", nullable = false)
    private long portfolioID;

    protected Security() {

    }

    public Security(String name, String category, 
        Float purchasePrice, Date purchaseDate, long quantity, long portfolioID) {

        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
        this.portfolioID = portfolioID;
    }

    public Long getSecurityId() {
        return securityId;
    }

    public long getPortfolioID() {
        return portfolioID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return purchasePrice;
    }

    public void setPrice(float purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Date getDate() {
        return purchaseDate;
    }

    public void setDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }
}
