package bill.components;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import main.AutoCodeGenerator;
import codesnippet.GetClassData;
import data.MethodData;
import data.ParameterData;
import data.VariableData;

public class DeltaBillComponent implements GetClassData
{

    @Override
    public String getPackage()
    {
        return AutoCodeGenerator.getConfig().getPackageInfo();
    }

    @Override
    public String getComments()
    {
        return "/*Delta Bill Component\n In case the new version of the bill needs to be a supplement bill, then this component should be used.*/";
    }

    @Override
    public String getClassName()
    {
        return AutoCodeGenerator.getConfig().getProject() + "DeltaBillComponent";
    }

    @Override
    public List< String > getImports()
    {
        return Arrays.asList( "com.azure.interconnect.taskcontroller.tasks.bill.BillException" );

    }

    @Override
    public List< String > getSuperClasses()
    {
        return Arrays.asList( "ConfigurableDeltaBillComponent" );
    }

    @Override
    public List< String > getInterfaces()
    {
        return Arrays.asList();
    }

    @Override
    public List< String > getAccessSpecifiers()
    {
        return Arrays.asList( "public" );
    }

    @Override
    public List< VariableData > getClassVariables()
    {

        return Arrays.asList();
    }

    @Override
    public List< MethodData > getMethods()
    {
        MethodData method1 = new MethodData();
        method1.setAccessSpecifiers( Arrays.asList( "public" ) );
        method1.setReturnType( "void" );
        method1.setFullyQualifiedClassName( "bill.components.DeltaBillComponent" );
        method1.setMethodName( "generateLineItems" );

        ParameterData method1pd1 = new ParameterData();
        method1pd1.setName( "hierarchy" );
        method1pd1.setType( "Hierarchy" );

        ParameterData method1pd2 = new ParameterData();
        method1pd2.setName( "billNode" );
        method1pd2.setType( "BillNode" );

        ParameterData method1pd3 = new ParameterData();
        method1pd3.setName( "profileNode" );
        method1pd3.setType( "ProfileNode" );

        method1.setParameters( Arrays.asList( method1pd1, method1pd2, method1pd3 ) );

        method1.setThrowsExceptions( Arrays.asList( "BillException" ) );
        method1.setMethodNameToBeInvoked( "writeGenerateLineItemsMethod" );

        return Arrays.asList( method1 );
    }

    public void writeGenerateLineItemsMethod( PrintWriter pw )
    {
        pw.println( "\t\t/* Overide this method in case there is need to change the logic to generate the bill line items */" );
        pw.println( "\t\ttry" );
        pw.println( "\t\t{" );
        pw.println( "\t\t\tsuper.generateLineItems();" );
        pw.println( "\t\t}" );
        pw.println( "\t\tcatch(BillException e)" );
        pw.println( "\t\t{" );
        pw.println( "\t\t}" );
    }

    @Override
    public String getFolder()
    {
        return "billcomponent";
    }

}
