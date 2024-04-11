package com.kekwy.sqlni.generator;

import com.github.drinkjava2.jdialects.Dialect;
import com.kekwy.sqlni.parser.SQLNIDialectProcessor;
import com.kekwy.sqlni.parser.SQLNIXMLProcessor;
import com.kekwy.sqlni.util.Node;
import com.kekwy.sqlni.util.NodeSerializerStringImp;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class MapperXMLGeneratorTest {

    @Test
    public void test() {
        Dialect dialect = Dialect.MySQL57Dialect;
        String statement = "select * from t_table";
        String statement1 = "select #if(test!=null) * from #endif t_table where c1 in #foreach(#{set1}) and c2 in #foreach(${set2})";

        Node node = new SQLNIXMLProcessor().process(new SQLNIDialectProcessor(dialect).process(statement1));
        List<String> buffer = new LinkedList<>();
        NodeSerializerStringImp serializer = new NodeSerializerStringImp(0, buffer);
        node.serialize(serializer);

        for (Object s : buffer.stream().skip(1).toArray()) {
            System.out.println(s);
        }
    }

}