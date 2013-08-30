package configuration;

import java.io.File;
import java.util.HashSet;

public class ConfigurationValidator
{
    private static HashSet< String > roundingmodes = null;

    static
    {
        roundingmodes = new HashSet< String >();
        roundingmodes.add( "CEILING" );
        roundingmodes.add( "DOWN" );
        roundingmodes.add( "FLOOR" );
        roundingmodes.add( "HALF_DOWN" );
        roundingmodes.add( "HALF_UP" );
        roundingmodes.add( "HALF_EVEN" );
        roundingmodes.add( "UP" );
    }

    public static boolean validateBoolean( String value )
    {
        if ( !value.equals( "true" ) && !value.equals( "false" ) )
        {
            return false;
        }

        return true;
    }

    public static boolean validateRoundingMode( String value )
    {
        if ( !roundingmodes.contains( value ) )
        {
            return false;
        }
        return true;
    }

    public static boolean validateFolder( String folder )
    {
        File file = new File( folder );
        if ( file.isDirectory() )
        {
            return false;
        }
        return true;
    }
}
