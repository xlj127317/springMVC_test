package com.wind.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author wind
 */
@Data
public class User implements Serializable {
    private String name;
    private Integer age;
    private Date date;
}
