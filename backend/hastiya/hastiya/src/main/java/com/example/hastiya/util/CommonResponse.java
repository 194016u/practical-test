package com.example.hastiya.util;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CommonResponse {

    private List<Object> payload = null;
    private Boolean status = false;


}
