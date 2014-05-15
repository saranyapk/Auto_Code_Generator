package writer;

import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import writer.helper.WriterHelper;
import configuration.Configuration;
import data.MethodData;
import data.ParameterData;
import exception.BillAutoCodeGenerateException;

public class MethodWriter
{
    private Configuration config;

    public MethodWriter( Configuration config )
    {
        this.config = config;
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public void write( MethodData methodData, PrintWriter printWriter ) throws BillAutoCodeGenerateException
    {
        printWriter.print( "\t" + WriterHelper.getListAsString( methodData.getAccessSpecifiers() ) + methodData.getReturnType() + " " + methodData.getMethodName() + "( " );

        if ( methodData.getParameters() != null )
        {
            for ( int parameterCount = 0; parameterCount < methodData.getParameters().size(); parameterCount++ )
            {
                ParameterData parameterData = methodData.getParameters().get( parameterCount );

                if ( parameterCount == ( methodData.getParameters().size() - 1 ) )
                {
                    printWriter.print( " " + parameterData.getType() + " " + parameterData.getName() + " ) " );
                }
                else
                {
                    printWriter.print( " " + parameterData.getType() + " " + parameterData.getName() + " ," );
                }
            }
        }
        else
        {
            printWriter.print( " ) " );
        }
        
        if ( methodData.getThrowsExceptions() != null && methodData.getThrowsExceptions().size() > 0 )
        {
            printWriter.print( " throws " + WriterHelper.getListAsString( methodData.getThrowsExceptions() ) );
        }

        printWriter.println();

        printWriter.println( "\t{" );

        try
        {
            if ( methodData.getFullyQualifiedClassName() != null && methodData.getMethodNameToBeInvoked() != null )
            {
                Class clazz = Class.forName( methodData.getFullyQualifiedClassName() );

                Object obj = clazz.newInstance();

                Method method = clazz.getDeclaredMethod( methodData.getMethodNameToBeInvoked(), new Class[] { PrintWriter.class } );

                method.invoke( obj, new Object[] { printWriter } );
            }
        }
        catch ( ClassNotFoundException e )
        {
            throw new BillAutoCodeGenerateException( e );
        }
        catch ( InstantiationException e )
        {
            throw new BillAutoCodeGenerateException( e );
        }
        catch ( IllegalAccessException e )
        {
            throw new BillAutoCodeGenerateException( e );
        }
        catch ( SecurityException e )
        {
            throw new BillAutoCodeGenerateException( e );
        }
        catch ( NoSuchMethodException e )
        {
            throw new BillAutoCodeGenerateException( e );
        }
        catch ( IllegalArgumentException e )
        {
            throw new BillAutoCodeGenerateException( e );
        }
        catch ( InvocationTargetException e )
        {
            throw new BillAutoCodeGenerateException( e );
        }

        printWriter.println();

        printWriter.println( "\t}" );

    }
}
