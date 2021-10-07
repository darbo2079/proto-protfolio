package com.db.welearn.repository;

import com.db.welearn.domain.StudyGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<StudyGroup, Long> {

}
