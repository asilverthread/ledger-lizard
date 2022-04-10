package com.ledgerlizard.ledgerlizardbackend.data;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "transaction", schema = "core", catalog = "ledgerlizard")
public class TransactionEntity {
    private int transactionId;
    private Date transactiondate;
    private Long amount;
    private Integer userId;
    private String person;

    @Id
    @Column(name = "transaction_id")
    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    @Basic
    @Column(name = "transactiondate")
    public Date getTransactiondate() {
        return transactiondate;
    }

    public void setTransactiondate(Date transactiondate) {
        this.transactiondate = transactiondate;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransactionEntity that = (TransactionEntity) o;
        return transactionId == that.transactionId && Objects.equals(transactiondate, that.transactiondate) && Objects.equals(amount, that.amount) && Objects.equals(userId, that.userId) && Objects.equals(person, that.person);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transactionId, transactiondate, amount, userId, person);
    }
}
