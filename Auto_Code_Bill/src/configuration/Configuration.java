package configuration;

import java.util.List;

public class Configuration
{
    private String packageInfo;
    private boolean isDelta;
    private boolean queryProcessorRequired;
    private List< String > birtparameters;
    private List< String > extraKeyComponents;
    private List< String > extraValueComponents;
    private String dateFormat;
    private String roundingMode;
    private String outputfolder;
    private String project;

    public String getPackageInfo()
    {
        return packageInfo;
    }

    public boolean isDelta()
    {
        return isDelta;
    }

    public boolean isQueryProcessorRequired()
    {
        return queryProcessorRequired;
    }

    public List< String > getBirtparameters()
    {
        return birtparameters;
    }

    public List< String > getExtraKeyComponents()
    {
        return extraKeyComponents;
    }

    public List< String > getExtraValueComponents()
    {
        return extraValueComponents;
    }

    public String getDateFormat()
    {
        return dateFormat;
    }

    public String getRoundingMode()
    {
        return roundingMode;
    }

    public void setPackageInfo( String packageInfo )
    {
        this.packageInfo = packageInfo;
    }

    public void setDelta( boolean isDelta )
    {
        this.isDelta = isDelta;
    }

    public void setQueryProcessorRequired( boolean queryProcessorRequired )
    {
        this.queryProcessorRequired = queryProcessorRequired;
    }

    public void setBirtparameters( List< String > birtparameters )
    {
        this.birtparameters = birtparameters;
    }

    public void setExtraKeyComponents( List< String > extraKeyComponents )
    {
        this.extraKeyComponents = extraKeyComponents;
    }

    public void setExtraValueComponents( List< String > extraValueComponents )
    {
        this.extraValueComponents = extraValueComponents;
    }

    public void setDateFormat( String dateFormat )
    {
        this.dateFormat = dateFormat;
    }

    public void setRoundingMode( String roundingMode )
    {
        this.roundingMode = roundingMode;
    }

    public String getOutputFolder()
    {
        return outputfolder;
    }

    public void setOutputFolder( String outputfolder )
    {
        this.outputfolder = outputfolder;
    }

    public String getProject()
    {
        return project;
    }

    public void setProject( String project )
    {
        this.project = project;
    }

}
