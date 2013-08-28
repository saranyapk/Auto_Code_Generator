package configuration;

import java.util.HashMap;
import java.util.List;

import exception.BillAutoCodeGenerateException;

public class ConfigurationReader
{
    HashMap< String, Object > input = null;

    public ConfigurationReader( HashMap< String, Object > input )
    {
        this.input = input;
    }

    public Configuration read() throws BillAutoCodeGenerateException
    {
        Configuration config = new Configuration();

        String packageInfo = (String)input.get( "package" );

        config.setPackageInfo( packageInfo );

        String isDelta = (String)input.get( "is-delta" );

        if ( !ConfigurationValidator.validateBoolean( isDelta ) )
        {
            throw new BillAutoCodeGenerateException( "The value of is-delta is not valid. Valid values are true/false" );
        }
        else
        {
            config.setDelta( Boolean.parseBoolean( isDelta ) );
        }

        String isQueryProcessorRequired = (String)input.get( "query-processor-required" );

        if ( !ConfigurationValidator.validateBoolean( isQueryProcessorRequired ) )
        {
            throw new BillAutoCodeGenerateException( "The value of query-processor-required is not valid. Valid values are Y/y/N/n." );
        }
        else
        {
            config.setQueryProcessorRequired( Boolean.parseBoolean( isQueryProcessorRequired ) );
        }

        String roundingMode = (String)input.get( "rounding-mode" );

        if ( !ConfigurationValidator.validateRoundingMode( roundingMode ) )
        {

        }

        List< String > birtParameters = (List< String >)input.get( "birt-parameters" );

        config.setBirtparameters( birtParameters );

        List< String > extraKeyComponents = (List< String >)input.get( "extra-key-components" );

        config.setExtraKeyComponents( extraKeyComponents );

        List< String > extraValueComponents = (List< String >)input.get( "extra-value-components" );

        config.setExtraValueComponents( extraValueComponents );

        return config;
    }
}
