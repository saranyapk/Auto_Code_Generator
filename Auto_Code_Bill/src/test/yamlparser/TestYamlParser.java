package test.yamlparser;

import java.util.HashMap;

import junit.framework.TestCase;

import org.junit.Test;

import exception.BillAutoCodeGenerateException;

import yamlparser.YamlParser;

public class TestYamlParser extends TestCase
{
    private String filePath = null;

    protected void setUp()
    {
        filePath = getClass().getClassLoader().getResource( "test/yamlparser/testconfig.yml" ).getFile();
    }

    @Test
    public void testParse()
    {
        boolean exception = false;

        try
        {
            HashMap< String, Object > map = YamlParser.parse( filePath );

            assertEquals( "com.subex.interconnect.sitespecific.idea.taskcontroller.tasks.bill", map.get( "package" ) );

        }
        catch ( BillAutoCodeGenerateException e )
        {
            e.printStackTrace();
            exception = true;

        }

        assertFalse( exception );
    }

}
