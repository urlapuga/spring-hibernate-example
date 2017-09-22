package com.boraji.tutorial.spring.serviceEntities;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "task_status", schema = "service")
public class TaskStatus {
    private Integer id;
    private String name;
    private Collection<Tasks> tasksById;

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 0)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TaskStatus that = (TaskStatus) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "taskStatusByStatus")
    public Collection<Tasks> getTasksById() {
        return tasksById;
    }

    public void setTasksById(Collection<Tasks> tasksById) {
        this.tasksById = tasksById;
    }
}
