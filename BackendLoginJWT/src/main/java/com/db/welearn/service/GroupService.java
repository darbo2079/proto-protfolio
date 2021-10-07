package com.db.welearn.service;

import com.db.welearn.domain.StudyGroup;
import com.db.welearn.domain.User;

import java.util.List;

public interface GroupService {
   StudyGroup addNewGroup(String groupName);
   void deleteGroup(long id);
   List<StudyGroup> getGroups();
}
