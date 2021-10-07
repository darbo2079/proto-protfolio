package com.db.welearn.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

//Serilizable erleichtert das Speichern in die Datenbank

@Entity
public class StudyGroup implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String groupName;
    private String groupAdmin;
    private Date creationDate;
    private boolean isNotPrivate;



    //default constructor
    public StudyGroup() {}

    public StudyGroup(Long id, String groupName, String groupAdmin, Date creationDate, boolean isNotPrivate) {
        this.id = id;
        this.groupName = groupName;
        this.groupAdmin = groupAdmin;
        this.creationDate = creationDate;
        this.isNotPrivate = isNotPrivate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupAdmin() {
        return groupAdmin;
    }

    public void setGroupAdmin(String groupAdmin) {
        this.groupAdmin = groupAdmin;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public boolean isNotPrivate() {return isNotPrivate;}

    public void setNotPrivate(boolean notPrivate) {
        isNotPrivate = notPrivate;
    }

}
