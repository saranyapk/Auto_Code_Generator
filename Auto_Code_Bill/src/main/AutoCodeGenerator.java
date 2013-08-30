package main;

import java.util.HashMap;

import bill.BillCodeGenerator;

import yamlparser.YamlParser;
import configuration.Configuration;
import configuration.ConfigurationReader;
import exception.BillAutoCodeGenerateException;

public class AutoCodeGenerator
{
    public static Configuration config = null;

    public static void main( String args[] ) throws BillAutoCodeGenerateException
    {
        if ( args.length != 1 )
        {
            printHelp();
            return;
        }
        String ymlConfigFile = args[0];
        YamlParser yamlParser = new YamlParser();
        HashMap< String, Object > input = yamlParser.parse( ymlConfigFile );
        ConfigurationReader configReader = new ConfigurationReader( input );
        config = configReader.read();

        BillCodeGenerator billCodeGenerator = new BillCodeGenerator();

        billCodeGenerator.generate();
    }

    private static void printHelp()
    {
        System.out.println( "Usage: java -jar AutoCodeBill <Config file path>" );
    }
}
