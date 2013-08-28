package yamlparser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

import com.esotericsoftware.yamlbeans.YamlException;
import com.esotericsoftware.yamlbeans.YamlReader;

import exception.BillAutoCodeGenerateException;

public class YamlParser
{
    /**
     * file: Complete Path of the .yml file 
     * @throws BillAutoCodeGenerateException 
     */
    public static HashMap< String, Object > parse( String file ) throws BillAutoCodeGenerateException
    {
        YamlReader yr = null;
        try
        {
            yr = new YamlReader( new FileReader( file ) );
        }
        catch ( FileNotFoundException e1 )
        {
            throw new BillAutoCodeGenerateException( "Error while parsing the YAML file", e1 );
        }
        try
        {
            HashMap< String, Object > map = (HashMap)yr.read();

            return map;
        }
        catch ( YamlException e )
        {
            throw new BillAutoCodeGenerateException( "Error while reading the YAML file", e );
        }

    }
}
