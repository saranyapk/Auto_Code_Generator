package data;

import java.util.List;

public class MethodData
{
    private String comments;
    private List< String > accessSpecifiers;
    private String returnType;
    private String methodName;
    private List< ParameterData > parameters;
    /**
     * This method should have the logic to write out the code for that method
     */
    private String fullyQualifiedClassName;
    private String methodNameToBeInvoked;

    public String getComments()
    {
        return comments;
    }

    public List< String > getAccessSpecifiers()
    {
        return accessSpecifiers;
    }

    public String getReturnType()
    {
        return returnType;
    }

    public String getMethodName()
    {
        return methodName;
    }

    public List< ParameterData > getParameters()
    {
        return parameters;
    }

    public String getFullyQualifiedClassName()
    {
        return fullyQualifiedClassName;
    }

    public String getMethodNameToBeInvoked()
    {
        return methodNameToBeInvoked;
    }

    public void setComments( String comments )
    {
        this.comments = comments;
    }

    public void setAccessSpecifiers( List< String > accessSpecifiers )
    {
        this.accessSpecifiers = accessSpecifiers;
    }

    public void setReturnType( String returnType )
    {
        this.returnType = returnType;
    }

    public void setMethodName( String methodName )
    {
        this.methodName = methodName;
    }

    public void setParameters( List< ParameterData > parameters )
    {
        this.parameters = parameters;
    }

    public void setFullyQualifiedClassName( String fullyQualifiedClassName )
    {
        this.fullyQualifiedClassName = fullyQualifiedClassName;
    }

    public void setMethodNameToBeInvoked( String methodNameToBeInvoked )
    {
        this.methodNameToBeInvoked = methodNameToBeInvoked;
    }

   
}
