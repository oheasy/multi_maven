package com.hxy.response;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * Created by hxy-pc on 2016/9/21.
 */
@Component
@Data
public class StuResponse {
    private String name = "hxy";
    private Integer age = 90;
    private String school = "bupt";


}
