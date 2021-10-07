package com.db.group.io.entity;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Entity
public class GroupEntity implements Serializable {


    @Serial
    private static final long serialVersionUID = 7766176767451183218L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    //@Column(nullable = false)

    //public id
    private String publicGroupId;
    //@Column(nullable = false)
    private String groupName;
    //@Column(nullable = false)
    private String groupDescription;
    //@Column(nullable = false)
    private Date creationDate = new Date();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPublicGroupId() {
        return publicGroupId;
    }

    public void setPublicGroupId(String publicGroupId) {
        this.publicGroupId = publicGroupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupDescription() {
        return groupDescription;
    }

    public void setGroupDescription(String groupDescription) {
        this.groupDescription = groupDescription;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}

