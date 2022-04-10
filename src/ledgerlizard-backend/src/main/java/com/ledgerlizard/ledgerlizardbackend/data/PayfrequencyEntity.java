package com.ledgerlizard.ledgerlizardbackend.data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "payfrequency", schema = "core", catalog = "ledgerlizard")
public class PayfrequencyEntity {
    private int payfrequencyId;
    private String shortdescription;
    private String description;

    @Id
    @Column(name = "payfrequency_id")
    public int getPayfrequencyId() {
        return payfrequencyId;
    }

    public void setPayfrequencyId(int payfrequencyId) {
        this.payfrequencyId = payfrequencyId;
    }

    @Basic
    @Column(name = "shortdescription")
    public String getShortdescription() {
        return shortdescription;
    }

    public void setShortdescription(String shortdescription) {
        this.shortdescription = shortdescription;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PayfrequencyEntity that = (PayfrequencyEntity) o;
        return payfrequencyId == that.payfrequencyId && Objects.equals(shortdescription, that.shortdescription) && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(payfrequencyId, shortdescription, description);
    }
}
