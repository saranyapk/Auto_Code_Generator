package test.writer;

import java.util.Arrays;
import java.util.List;

import junit.framework.TestCase;
import writer.ClassWriter;
import configuration.Configuration;
import data.ClassData;
import data.MethodData;
import data.VariableData;
import exception.BillAutoCodeGenerateException;

public class TestClassWriter extends TestCase
{
    public ClassData classData = null;
    public Configuration config = null;

    protected void setUp()
    {
        classData = new ClassData();
        classData.setClassName( "Test1" );
        classData.setPackageInfo( "com.subex" );
        classData.setFolder( "test" );
        classData.setAccessSpecifiers( Arrays.asList( "private" ) );

        List< String > superClass = Arrays.asList( "SuperClass1", "SuperClass2" );
        classData.setSuperClasses( superClass );

        List< String > interfaceClass = Arrays.asList( "InterfaceClass1", "InterfaceClass2" );
        classData.setInterfaces( interfaceClass );

        VariableData variableData1 = new VariableData();
        VariableData variableData2 = new VariableData();
        variableData1.setAccessSpecifiers( Arrays.asList( "public", "final" ) );
        variableData2.setAccessSpecifiers( Arrays.asList( "public", "final" ) );

        variableData1.setType( "String" );
        variableData2.setType( "Integer" );

        variableData1.setName( "string1" );
        variableData2.setName( "integer1" );

        variableData1.setValue( "\"Subex\"" );

        classData.setClassVariables( Arrays.asList( variableData1, variableData2 ) );

        MethodData methodData = new MethodData();
        methodData.setAccessSpecifiers( Arrays.asList( "public", "final" ) );
        methodData.setReturnType( "String" );
        methodData.setMethodName( "test" );

        config = new Configuration();
        config.setOutputFolder( "D:\\Projects\\Internal-GDO\\Test" );
    }

    public void testWrite()
    {
        ClassWriter classWriter = new ClassWriter( config );
        try
        {
           // classWriter.write( new ClassData() );
            classWriter.write( classData );
        }
        catch ( BillAutoCodeGenerateException e )
        {
            e.printStackTrace();
        }

        
    }
}
