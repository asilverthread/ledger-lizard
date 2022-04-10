package com.ledgerlizard.ledgerlizardbackend.data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "bill", schema = "core", catalog = "ledgerlizard")
public class BillEntity {
    private int billId;
    private String description;
    private BigDecimal amount;
    private Integer dueday;
    private Date startdate;
    private Date enddate;
    private Boolean autopay;
    private Boolean payfromjointaccount;

    @Id
    @Column(name = "bill_id")
    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
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
    @Column(name = "amount")
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "dueday")
    public Integer getDueday() {
        return dueday;
    }

    public void setDueday(Integer dueday) {
        this.dueday = dueday;
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

    @Basic
    @Column(name = "autopay")
    public Boolean getAutopay() {
        return autopay;
    }

    public void setAutopay(Boolean autopay) {
        this.autopay = autopay;
    }

    @Basic
    @Column(name = "payfromjointaccount")
    public Boolean getPayfromjointaccount() {
        return payfromjointaccount;
    }

    public void setPayfromjointaccount(Boolean payfromjointaccount) {
        this.payfromjointaccount = payfromjointaccount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BillEntity that = (BillEntity) o;
        return billId == that.billId && Objects.equals(description, that.description) && Objects.equals(amount, that.amount) && Objects.equals(dueday, that.dueday) && Objects.equals(startdate, that.startdate) && Objects.equals(enddate, that.enddate) && Objects.equals(autopay, that.autopay) && Objects.equals(payfromjointaccount, that.payfromjointaccount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(billId, description, amount, dueday, startdate, enddate, autopay, payfromjointaccount);
    }
}
