package com.db.welearn.service.impl;

import com.db.welearn.domain.StudyGroup;
import com.db.welearn.repository.GroupRepository;
import com.db.welearn.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class GroupServiceImpl implements GroupService {
    private GroupRepository groupRepository;

    @Autowired
    public GroupServiceImpl(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    @Override
    public StudyGroup addNewGroup(String groupName) {
        StudyGroup studyGroup = new StudyGroup();
        studyGroup.setGroupName(groupName);
        studyGroup.setCreationDate(new Date());
        studyGroup.setNotPrivate(studyGroup.isNotPrivate());
        groupRepository.save(studyGroup);
        return studyGroup;
    }

    @Override
    public void deleteGroup(long id) {

    }

    @Override
    public List<StudyGroup> getGroups() {
        return groupRepository.findAll();
    }
}
