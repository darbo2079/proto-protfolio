package com.db.group.shared.dto;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

public class GroupDto implements Serializable {

    @Serial
    private static final long serialVersionUID = -7923498279933111451L;
    private long id;
    private String publicGroupId;
    private String groupName;
    private String groupDescription;
    private Date creationDate;

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
