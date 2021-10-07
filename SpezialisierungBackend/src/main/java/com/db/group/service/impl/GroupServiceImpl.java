package com.db.group.service.impl;

import com.db.group.io.entity.GroupEntity;
import com.db.group.repository.GroupRepository;
import com.db.group.service.GroupService;
import com.db.group.shared.dto.GroupDto;
import com.db.group.shared.dto.Utils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class GroupServiceImpl implements GroupService {

    @Autowired
    GroupRepository groupRepository;

    @Autowired
    Utils utils;

    @Override
    public GroupDto createGroup(GroupDto groupDto) {

        GroupEntity groupEntity = new GroupEntity();
        BeanUtils.copyProperties(groupDto, groupEntity);

        String publicGroupId = utils.generatePublicId(10);
        groupEntity.setPublicGroupId(publicGroupId);
        groupEntity.setCreationDate(new Date());
        GroupEntity storedGroupDetails = groupRepository.save(groupEntity);

        GroupDto returnValue = new GroupDto();
        BeanUtils.copyProperties(storedGroupDetails, returnValue);

        return returnValue;
    }

    @Override
    public List<GroupDto> getGroups() {
        List<GroupDto> returnValue = new ArrayList<>();
        List<GroupEntity> groups = groupRepository.findAll();

        for (GroupEntity groupEntity : groups) {
            GroupDto groupDto = new GroupDto();
            BeanUtils.copyProperties(groupEntity, groupDto);
            returnValue.add(groupDto);
        }
        return returnValue;
    }



    @Override
    public GroupDto findByGroupId(String groupId) {
        GroupDto returnValue = new GroupDto();
        GroupEntity group = groupRepository.findByGroupId(groupId);
        BeanUtils.copyProperties(group, returnValue);
        return returnValue;
    }
}
