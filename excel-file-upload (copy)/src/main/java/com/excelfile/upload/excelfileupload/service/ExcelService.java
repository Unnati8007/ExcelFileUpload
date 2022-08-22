package com.excelfile.upload.excelfileupload.service;

import com.excelfile.upload.excelfileupload.helper.ExcelHelper;
import com.excelfile.upload.excelfileupload.model.Tutorial;
import com.excelfile.upload.excelfileupload.repository.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public class ExcelService {

    @Autowired
    TutorialRepository tutorialRepository;

    public void save(MultipartFile file){
        try {
            List<Tutorial> tutorials = ExcelHelper.excelToTutorials(file.getInputStream());
           tutorialRepository.saveAll(tutorials);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public List<Tutorial> getAllTutorials() {
        return tutorialRepository.findAll();
    }
}
