package com.example.hastiya.service;

import com.example.hastiya.dto.FormDto;
import com.example.hastiya.entity.Form;
import com.example.hastiya.repository.FormRepository;
import com.example.hastiya.util.CommonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

@Service
public class FormService {
    private FormRepository formRepository;

    @Autowired
    public FormService(FormRepository formRepository) {
        this.formRepository = formRepository;
    }

    public CommonResponse saveEmployee(FormDto formDto) {

        CommonResponse commonResponse = new CommonResponse();

        try {

            Form form = new Form();

            form.setName(formDto.getName());
            form.setEmail(formDto.getEmail());
            form.setBirthday(stringToDate(formDto.getBirthday()));
            form.setGender(formDto.getGender());
            form.setExperience(formDto.getExperience());

            formRepository.save(form);
            commonResponse.setStatus(true);

        }catch (Exception e){
            System.out.println(e);
        }
        return commonResponse;
    }

    public Date stringToDate(String date){

        DateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        Date date1 = null;

        try {
            date1 = format.parse(date);
        } catch (Exception e) {
            System.out.println(e);
        }

        return date1;
    }
}
