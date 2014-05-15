package bill.components;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import main.AutoCodeGenerator;
import bill.common.AccessSpecifier;
import bill.components.common.CommonCode;
import codesnippet.GetClassData;
import data.MethodData;
import data.ParameterData;
import data.VariableData;

public class NonDeltaBillComponent implements GetClassData
{

    @Override
    public String getPackage()
    {
        return AutoCodeGenerator.getConfig().getPackageInfo();
    }

    @Override
    public String getComments()
    {
        return "/*Non Delta Bill Component\n In case the new version of the bill needs to be a complete bill and cancel the previous bill, then this component should be used.*/";
    }

    @Override
    public String getClassName()
    {
        return AutoCodeGenerator.getConfig().getProject() + "NonDeltaBillComponent";
    }

    @Override
    public List< String > getImports()
    {
        return null;
    }

    @Override
    public List< String > getSuperClasses()
    {
        return Arrays.asList( "ConfigurableBillComponent" );
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
        return Arrays.asList( getGenerateBillReferenceMethod(), getGenerateLineItemsMethods() );
    }

    private MethodData getGenerateBillReferenceMethod()
    {
        MethodData md = new MethodData();
        md.setAccessSpecifiers( Arrays.asList( AccessSpecifier.PUBLIC ) );
        md.setReturnType( "String" );
        md.setFullyQualifiedClassName( "bill.components.NonDeltaBillComponent" );
        md.setMethodNameToBeInvoked( "writeGenerateBillReferenceMethod" );
        md.setThrowsExceptions( Arrays.asList( "BillException" ) );
        md.setMethodName( "generateBillReference" );
        md.setParameters( Arrays.asList( CommonCode.getHierarchyParamter(), CommonCode.getBillNodeParamter(), CommonCode.getProfileNodeParamter() ) );
        return md;
    }

    public void writeGenerateBillReferenceMethod( PrintWriter pw )
    {
        pw.println( "\t/*The custom bill reference format can be specified here*/" );
    }

    private MethodData getGenerateLineItemsMethods()
    {
        MethodData md = new MethodData();
        md.setAccessSpecifiers( Arrays.asList( "public" ) );
        md.setReturnType( "void" );
        md.setFullyQualifiedClassName( "bill.components.NonDeltaBillComponent" );
        md.setMethodName( "generateLineItems" );

        md.setParameters( Arrays.asList( CommonCode.getHierarchyParamter(), CommonCode.getBillNodeParamter(), CommonCode.getProfileNodeParamter() ) );

        md.setThrowsExceptions( Arrays.asList( "BillException" ) );
        md.setMethodNameToBeInvoked( "writeGenerateLineItemsMethod" );

        return md;
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
