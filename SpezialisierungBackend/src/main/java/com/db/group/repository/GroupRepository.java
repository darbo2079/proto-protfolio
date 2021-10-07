package com.db.group.repository;

import com.db.group.io.entity.GroupEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends JpaRepository<GroupEntity, Long> {
    GroupEntity findByGroupName(String groupName);

    GroupEntity findByGroupId(String groupId);
    //GroupEntity findByGroupId(String groupId);
}
