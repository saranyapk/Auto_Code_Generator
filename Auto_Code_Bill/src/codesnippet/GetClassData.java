package codesnippet;

import java.util.List;

import data.MethodData;
import data.VariableData;

public interface GetClassData
{
    public String getPackage();

    public String getComments();

    public String getPackageInfo();

    public String getClassName();

    public List< String > getImports();

    public List< String > getSuperClasses();

    public List< String > getInterfaces();

    public List< String > getAccessSpecifiers();

    public List< VariableData > getClassVariables();

    public List< MethodData > getMethods();

}
