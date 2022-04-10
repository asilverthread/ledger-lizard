package com.ledgerlizard.ledgerlizardbackend.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "project", schema = "core", catalog = "ledgerlizard")
public class ProjectEntity {
    private int projectId;

    @Id
    @Column(name = "project_id")
    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProjectEntity that = (ProjectEntity) o;
        return projectId == that.projectId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId);
    }
}
