package com.kekwy.mybatis.sqlni;

import com.querydsl.sql.SQLTemplates;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

/**
 * description
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/12 14:06
 */
public class RegexTest {

    private static final Pattern RESULT_TYPE_PATTERN = Pattern.compile(".+<(.+)>");

    private String parseResultType(String returnType) {
        Matcher matcher = RESULT_TYPE_PATTERN.matcher(returnType);
        if (matcher.find()) {
            return matcher.group(1);
        } else {
            return returnType;
        }
    }

    @Test
    public void parseResultTypeTest() {
        System.out.println(parseResultType("List<EEE>"));

//        SQLTemplates
    }


}