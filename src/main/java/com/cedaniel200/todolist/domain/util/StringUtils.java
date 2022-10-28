package com.cedaniel200.todolist.domain.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {

    public static boolean isNullOrBlank(String value){
        return value == null ||value.isBlank();
    }
    public static boolean isNotNullOrBlank(String value){
       return !isNullOrBlank(value);
    }

    public static boolean isNotEmail(String toDoList) {
        String reg = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
        Pattern pattern = Pattern.compile(reg);
        Matcher mather = pattern.matcher(toDoList);
        return !mather.find();
    }
}
