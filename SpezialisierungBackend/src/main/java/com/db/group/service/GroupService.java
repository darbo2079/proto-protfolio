package com.db.group.service;


import com.db.group.shared.dto.GroupDto;

import java.util.List;


public interface GroupService {

    GroupDto createGroup(GroupDto groupDto);

    List<GroupDto> getGroups();

    GroupDto findByGroupId(String groupId);
}
