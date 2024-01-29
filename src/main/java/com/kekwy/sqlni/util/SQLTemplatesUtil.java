package com.kekwy.sqlni.util;

import com.kekwy.sqlni.templates.MySQLTemplates;
import com.kekwy.sqlni.templates.OracleTemplates;
import com.kekwy.sqlni.templates.SQLTemplates;

import java.util.Map;

public class SQLTemplatesUtil {

    private static final Map<String, SQLTemplates> templatesMap = Map.of(
            "MySQL", new MySQLTemplates(),
            "Oracle", new OracleTemplates()
    );

    public static SQLTemplates getTemplates(String name) {
        return templatesMap.get(name);
    }

}
