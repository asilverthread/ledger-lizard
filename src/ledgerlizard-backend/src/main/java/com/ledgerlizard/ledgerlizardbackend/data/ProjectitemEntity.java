package com.ledgerlizard.ledgerlizardbackend.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "projectitem", schema = "core", catalog = "ledgerlizard")
public class ProjectitemEntity {
    private int projectitemId;

    @Id
    @Column(name = "projectitem_id")
    public int getProjectitemId() {
        return projectitemId;
    }

    public void setProjectitemId(int projectitemId) {
        this.projectitemId = projectitemId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProjectitemEntity that = (ProjectitemEntity) o;
        return projectitemId == that.projectitemId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectitemId);
    }
}
