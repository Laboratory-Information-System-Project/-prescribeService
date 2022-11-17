package com.douzone.prescribeservice.util;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class ConvertMap {

    public static Map convertToMap(Object obj){

        Map map = new HashMap();
        Field[] fields = obj.getClass().getDeclaredFields();

        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);

            try{
                map.put(fields[i].getName(), fields[i].get(obj));
            }catch(Exception e){
                e.printStackTrace();
            }
        }

        return map;
    }
}
