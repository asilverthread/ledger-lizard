package com.ledgerlizard.ledgerlizardbackend.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "savingitem", schema = "core", catalog = "ledgerlizard")
public class SavingitemEntity {
    private int savingitemId;

    @Id
    @Column(name = "savingitem_id")
    public int getSavingitemId() {
        return savingitemId;
    }

    public void setSavingitemId(int savingitemId) {
        this.savingitemId = savingitemId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SavingitemEntity that = (SavingitemEntity) o;
        return savingitemId == that.savingitemId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(savingitemId);
    }
}
