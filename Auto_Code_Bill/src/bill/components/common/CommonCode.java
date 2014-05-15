package bill.components.common;

import data.ParameterData;

public class CommonCode
{
    public static ParameterData getHierarchyParamter()
    {
        ParameterData pd = new ParameterData();
        pd.setName( "hierarchy" );
        pd.setType( "Hierarchy" );
        return pd;
    }

    public static ParameterData getProfileNodeParamter()
    {
        ParameterData pd = new ParameterData();
        pd.setName( "profileNode" );
        pd.setType( "ProfileNode" );
        return pd;
    }

    public static ParameterData getBillNodeParamter()
    {
        ParameterData pd = new ParameterData();
        pd.setName( "billNode" );
        pd.setType( "BillNode" );
        return pd;
    }
}
