package com.wind.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 把字符串转化为日期
 */
public class StringToDateConverter implements Converter<String, Date> {
    /**
     * source
     * @param source
     * @return
     */
    @Override
    public Date convert(String source) {
        //判断
        if (source == null) {
            throw new RuntimeException("请您传入数据");
        }
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return df.parse(source);
        } catch (ParseException e) {
            throw new RuntimeException("数据类型转换出现异常");
        }
    }
}
