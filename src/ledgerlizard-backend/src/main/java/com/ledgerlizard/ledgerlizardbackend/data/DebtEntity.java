package com.ledgerlizard.ledgerlizardbackend.data;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "debt", schema = "core", catalog = "ledgerlizard")
public class DebtEntity {
    private int debtId;
    private String description;
    private Integer userId;
    private String person;
    private Long amount;
    private Date startdate;
    private Date enddate;

    @Id
    @Column(name = "debt_id")
    public int getDebtId() {
        return debtId;
    }

    public void setDebtId(int debtId) {
        this.debtId = debtId;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "user_id")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "person")
    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    @Basic
    @Column(name = "amount")
    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "startdate")
    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    @Basic
    @Column(name = "enddate")
    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DebtEntity that = (DebtEntity) o;
        return debtId == that.debtId && Objects.equals(description, that.description) && Objects.equals(userId, that.userId) && Objects.equals(person, that.person) && Objects.equals(amount, that.amount) && Objects.equals(startdate, that.startdate) && Objects.equals(enddate, that.enddate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(debtId, description, userId, person, amount, startdate, enddate);
    }
}
