package com.jsm.api.vo;

import lombok.Data;

@Data
public class StudentVO {
    private String firstName;
    private String lastName;
    private String fatherName;
    private String motherName;
    private String address;

    private String dob;
    private String gender;
    private String contactNumber;

    private String caste;
    private String category;
}
