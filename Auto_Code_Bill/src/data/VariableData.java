package data;

import java.util.List;

public class VariableData
{
    private List< String > accessSpecifiers;
    private String type;
    private String name;
    private String value;

    public List< String > getAccessSpecifiers()
    {
        return accessSpecifiers;
    }

    public String getType()
    {
        return type;
    }

    public String getName()
    {
        return name;
    }

    public String getValue()
    {
        return value;
    }

    public void setAccessSpecifiers( List< String > accessSpecifiers )
    {
        this.accessSpecifiers = accessSpecifiers;
    }

    public void setType( String type )
    {
        this.type = type;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    /**
     * The value should be complete:<br>
     * Eg: String  --> "String" <br>
     *     Integer --> 2 <br>
     *     Object  --> new Object() <br>
     *     Char    --> 'c' <br>
     */
    public void setValue( String value )
    {
        this.value = value;
    }
}
