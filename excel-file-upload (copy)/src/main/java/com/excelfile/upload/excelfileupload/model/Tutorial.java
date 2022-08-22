package com.excelfile.upload.excelfileupload.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="tutorials")
public class Tutorial {

    @Id
    private long id;
    private String title;
    private String description;
    private boolean published;
}

