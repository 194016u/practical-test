package com.example.hastiya.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class FormDto {

    private String name;
    private String email;
    private String birthday;
    private String gender;
    private String experience;

}
