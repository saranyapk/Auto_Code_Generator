package bill.components;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import main.AutoCodeGenerator;
import codesnippet.GetClassData;
import data.MethodData;
import data.ParameterData;
import data.VariableData;

public class QueryProcessor implements GetClassData
{

    @Override
    public String getPackage()
    {
        return AutoCodeGenerator.getConfig().getPackageInfo();
    }

    @Override
    public String getComments()
    {
        return "Query Processor";
    }

    @Override
    public String getClassName()
    {
        return AutoCodeGenerator.getConfig().getProject() + "QueryProcessor";
    }

    @Override
    public List< String > getImports()
    {
        return Arrays.asList( "com.azure.interconnect.taskcontroller.tasks.bill.BillException", "com.azure.sparkcommon.StringHelper" );
    }

    @Override
    public List< String > getSuperClasses()
    {
        return Arrays.asList( "AbstractBillQueryAndProcessor" );
    }

    @Override
    public List< String > getInterfaces()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List< String > getAccessSpecifiers()
    {

        return Arrays.asList( "public", "class" );
    }

    @Override
    public List< VariableData > getClassVariables()
    {
        return null;
    }

    @Override
    public List< MethodData > getMethods()
    {
        MethodData methodData = new MethodData();
        methodData.setAccessSpecifiers( Arrays.asList( "public" ) );
        methodData.setReturnType( "void" );
        methodData.setMethodName( "processRow" );
        methodData.setComments( "Processing of the row" );
        methodData.setThrowsExceptions( Arrays.asList( "BillException" ) );
        methodData.setFullyQualifiedClassName( "bill.components.QueryProcessor" );
        methodData.setMethodNameToBeInvoked( "writeProcessRowMethod" );
        ParameterData pd1 = new ParameterData();
        pd1.setName( "fields" );
        pd1.setType( "Object[]" );
        methodData.setParameters( Arrays.asList( pd1 ) );
        return Arrays.asList( methodData );
    }

    public void writeProcessRowMethod( PrintWriter pw )
    {
        pw.write( "\t\t/* In case the row needs to under go any change */" );
    }

    @Override
    public String getFolder()
    {
        return "queryprocessor";
    }

}
