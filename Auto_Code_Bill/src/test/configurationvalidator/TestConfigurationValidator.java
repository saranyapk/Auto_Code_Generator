package test.configurationvalidator;

import junit.framework.TestCase;

import org.junit.Test;

import configuration.ConfigurationValidator;

public class TestConfigurationValidator extends TestCase
{
    String booleanValY;
    String booleanValTrue;
    String booleanValN;
    String booleanValTRUE;

    String ceiling;
    String DOWN;
    String FLOOR;
    String HALF_DOWN;
    String HALF_UP;
    String HALF_EVEN;
    String UP;

    protected void setUp()
    {
        booleanValY = "Y";
        booleanValTrue = "true";
        booleanValN = "N";
        booleanValTRUE = "TRUE";

        ceiling = "CEILING";
        DOWN = "DOWN";
        FLOOR = "FLOOR";
        HALF_DOWN = "HALF_DOWN";
        HALF_UP = "HALF_UP";
        HALF_EVEN = "HALF_EVEN";
        UP = "UP";
    }

    @Test
    public void testValidateBoolean1()
    {
        assertEquals( false, ConfigurationValidator.validateBoolean( booleanValY ) );

    }

    public void testValidateBoolean2()
    {

        assertEquals( true, ConfigurationValidator.validateBoolean( booleanValTrue ) );

    }

    public void testValidateBoolean3()
    {

        assertEquals( false, ConfigurationValidator.validateBoolean( booleanValN ) );

    }

    public void testValidateBoolean4()
    {

        assertEquals( false, ConfigurationValidator.validateBoolean( booleanValTRUE ) );
    }

    public void testValidateRoundingMode1()
    {
        assertEquals( true, ConfigurationValidator.validateRoundingMode( ceiling ) );
    }

    public void testValidateRoundingMode2()
    {
        assertEquals( true, ConfigurationValidator.validateRoundingMode( FLOOR ) );
    }

    public void testValidateRoundingMode3()
    {
        assertEquals( true, ConfigurationValidator.validateRoundingMode( UP ) );
    }

    public void testValidateRoundingMode4()
    {
        assertEquals( true, ConfigurationValidator.validateRoundingMode( DOWN ) );
    }

    public void testValidateRoundingMode5()
    {
        assertEquals( true, ConfigurationValidator.validateRoundingMode( HALF_DOWN ) );
    }

    public void testValidateRoundingMode6()
    {
        assertEquals( true, ConfigurationValidator.validateRoundingMode( HALF_UP ) );
    }

    public void testValidateRoundingMode7()
    {
        assertEquals( true, ConfigurationValidator.validateRoundingMode( HALF_EVEN ) );
    }

    public void testValidateRoundingMode8()
    {
        assertEquals( false, ConfigurationValidator.validateRoundingMode( "HALF1" ) );
    }
}
