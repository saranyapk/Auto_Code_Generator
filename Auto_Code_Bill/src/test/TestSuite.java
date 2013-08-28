package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import test.configurationvalidator.TestConfigurationValidator;
import test.yamlparser.TestYamlParser;

@RunWith(Suite.class)
@Suite.SuiteClasses({ TestYamlParser.class, TestConfigurationValidator.class })


public class TestSuite
{

}
