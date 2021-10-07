package com.db.group.ui.model.response;

public class GroupRest {

    private String publicGroupId;      //this is not the db-id
    private String groupName;
    private String groupDescription;

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
}
