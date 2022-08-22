package com.excelfile.upload.excelfileupload.repository;

import com.excelfile.upload.excelfileupload.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
}
