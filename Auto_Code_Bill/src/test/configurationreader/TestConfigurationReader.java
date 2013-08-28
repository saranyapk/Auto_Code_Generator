package test.configurationreader;

import java.util.HashMap;

import org.junit.Test;

import junit.framework.TestCase;
import yamlparser.YamlParser;
import configuration.Configuration;
import configuration.ConfigurationReader;
import exception.BillAutoCodeGenerateException;

public class TestConfigurationReader extends TestCase
{
    HashMap< String, Object > input = null;

    protected void setUp()
    {
        try
        {
            input = YamlParser.parse( getClass().getClassLoader().getResource( "test/yamlparser/testconfig.yml" ).getFile() );
        }
        catch ( BillAutoCodeGenerateException e )
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Test
    public void testRead()
    {
        ConfigurationReader reader = new ConfigurationReader( input );

        try
        {
            Configuration config = reader.read();

            assertEquals( "com.subex.interconnect.sitespecific.idea.taskcontroller.tasks.bill", config.getPackageInfo() );
            assertEquals( true, config.isDelta() );
            assertEquals( true, config.isQueryProcessorRequired() );
            assertEquals( true, config.getBirtparameters().contains( "account" ) );
            assertEquals( true, config.getExtraKeyComponents().contains( "extrakey1" ) );
            assertEquals( true, config.getExtraValueComponents().contains( "extravalue1" ) );
            assertEquals( "ROUNDUP", config.getRoundingMode() );
            assertEquals( "DD-MMM-YYYY", config.getDateFormat() );
        }
        catch ( BillAutoCodeGenerateException e )
        {
            e.printStackTrace();
        }

    }
}
