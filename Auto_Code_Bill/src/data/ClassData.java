package data;

import java.util.List;

public class ClassData
{
    private String comments;
    private String folder;
    private String packageInfo;
    private List< String > imports;
    private List< String > accessSpecifiers;
    private String className;
    private List< String > interfaces;
    private List< String > superClasses;
    public List< VariableData > classVariables;
    public List< MethodData > methods;

    public String getComments()
    {
        return comments;
    }

    public String getFolder()
    {
        return folder;
    }

    public String getPackageInfo()
    {
        return packageInfo;
    }

    public List< String > getImports()
    {
        return imports;
    }

    public List< String > getAccessSpecifiers()
    {
        return accessSpecifiers;
    }

    public String getClassName()
    {
        return className;
    }

    public List< String > getInterfaces()
    {
        return interfaces;
    }

    public List< String > getSuperClasses()
    {
        return superClasses;
    }

    public List< VariableData > getClassVariables()
    {
        return classVariables;
    }

    public List< MethodData > getMethods()
    {
        return methods;
    }

    public void setComments( String comments )
    {
        this.comments = comments;
    }

    public void setFolder( String folder )
    {
        this.folder = folder;
    }

    public void setPackageInfo( String packageInfo )
    {
        this.packageInfo = packageInfo;
    }

    public void setImports( List< String > imports )
    {
        this.imports = imports;
    }

    public void setAccessSpecifiers( List< String > accessSpecifiers )
    {
        this.accessSpecifiers = accessSpecifiers;
    }

    public void setClassName( String className )
    {
        this.className = className;
    }

    public void setInterfaces( List< String > interfaces )
    {
        this.interfaces = interfaces;
    }

    public void setSuperClasses( List< String > superClasses )
    {
        this.superClasses = superClasses;
    }

    public void setClassVariables( List< VariableData > classVariables )
    {
        this.classVariables = classVariables;
    }

    public void setMethods( List< MethodData > methods )
    {
        this.methods = methods;
    }
}
