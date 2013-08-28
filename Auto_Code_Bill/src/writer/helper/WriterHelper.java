package writer.helper;

import java.util.List;

public class WriterHelper
{
    public static String getListAsString( List< String > list )
    {
        StringBuffer string = new StringBuffer();

        for ( int count = 0; count < list.size(); count++ )
        {
            string.append( list.get( count ) + " " );
        }

        return string.toString();
    }

    public static String getListAsCommaSeperatedString( List< String > list )
    {
        StringBuffer string = new StringBuffer();

        for ( int count = 0; count < list.size(); count++ )
        {
            string.append( list.get( count ) + "," );
        }

        return string.toString().substring( 0, string.length() - 2 );
    }
}
