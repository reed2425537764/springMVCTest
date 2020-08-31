package cn.case1.utils;

import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String s) {
        /*if (s==null || s.length()==0){
            return null;
        }*/
        if (StringUtils.isEmpty(s)){
            return null;
        }
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return df.parse(s);
        } catch (ParseException e) {
            throw new RuntimeException("the inputed date is not vaild");
        }
    }
}
