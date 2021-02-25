package com.wind.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author wind
 */
@Data
public class Account implements Serializable {
    private String username;
    private String password;
    private double money;

    private List<User> list;
    private Map<String,User> map;

//    private User user;

}
