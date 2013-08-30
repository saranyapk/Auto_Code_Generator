package writer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

import main.AutoCodeGenerator;

import org.joda.time.DateTime;

import writer.helper.WriterHelper;
import configuration.Configuration;
import data.ClassData;
import data.VariableData;
import exception.BillAutoCodeGenerateException;

public class ClassWriter
{
    private Configuration config;
    private MethodWriter methodWriter;

    public ClassWriter()
    {
        this.config = AutoCodeGenerator.config;
        methodWriter = new MethodWriter( config );
    }

    public void write( ClassData classData ) throws BillAutoCodeGenerateException
    {
        new File( config.getOutputFolder(), "\\AutoCodeBill\\" + classData.getFolder() ).mkdirs();

        File file = new File( config.getOutputFolder(), "\\AutoCodeBill\\" + classData.getFolder() + "\\" + classData.getClassName() + ".java" );

        if ( file.exists() )
        {
            file.renameTo( new File( config.getOutputFolder(), "\\AutoCodeBill\\" + classData.getFolder() + "\\" + file.getName() + ( new DateTime() ).toString( "ddMMYYYYHHmmss" ) ) );
        }

        PrintWriter printWriter = null;
        try
        {
            printWriter = new PrintWriter( new FileOutputStream( file ) );
        }
        catch ( FileNotFoundException e )
        {
            throw new BillAutoCodeGenerateException( e );
        }
        printWriter.print( "package " + classData.getPackageInfo() + "." + classData.getFolder() + ";" );

        printWriter.println();

        if ( classData.getImports() != null )
        {
            for ( int importCount = 0; importCount < classData.getImports().size(); importCount++ )
            {
                printWriter.println( "import " + classData.getImports().get( importCount ) + ";" );
            }
        }

        printWriter.println( "/** " + classData.getComments() + " */" );

        printWriter.print( WriterHelper.getListAsString( classData.getAccessSpecifiers() ) + " " + classData.getClassName() );

        if ( classData.getSuperClasses() != null && classData.getSuperClasses().size() > 1 )
        {
            printWriter.print( " extends " + WriterHelper.getListAsCommaSeperatedString( classData.getSuperClasses() ) );
        }

        if ( classData.getInterfaces() != null && classData.getInterfaces().size() > 1 )
        {
            printWriter.print( " implements " + WriterHelper.getListAsCommaSeperatedString( classData.getInterfaces() ) );
        }

        printWriter.println();
        printWriter.println( "{" );

        for ( int varCount = 0; varCount < classData.getClassVariables().size(); varCount++ )
        {
            VariableData variableData = classData.getClassVariables().get( varCount );

            printWriter.print( WriterHelper.getListAsString( variableData.getAccessSpecifiers() ) + " " + variableData.getType() + " " + variableData.getName() );

            if ( variableData.getValue() != null )
            {
                printWriter.print( " = " + variableData.getValue() );
            }

            printWriter.print( " ;" );
            printWriter.println();
        }

        if ( classData.getMethods() != null )
        {
            for ( int methodCount = 0; methodCount < classData.getMethods().size(); methodCount++ )
            {
                methodWriter.write( classData.getMethods().get( methodCount ), printWriter );
            }
        }

        printWriter.println( "}" );

        if ( printWriter != null )
        {
            printWriter.close();
        }
    }
}
