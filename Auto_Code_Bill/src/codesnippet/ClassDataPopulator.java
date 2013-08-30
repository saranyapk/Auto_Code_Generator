package codesnippet;

import data.ClassData;

public class ClassDataPopulator
{
    public ClassData classData = null;

    public ClassData populateNGetClassData( GetClassData getClassData )
    {
        classData = new ClassData();
        classData.setPackageInfo( getClassData.getPackageInfo() );
        classData.setImports( getClassData.getImports() );
        classData.setAccessSpecifiers( getClassData.getAccessSpecifiers() );
        classData.setClassName( getClassData.getClassName() );
        classData.setSuperClasses( getClassData.getSuperClasses() );
        classData.setInterfaces( getClassData.getInterfaces() );
        classData.setClassVariables( getClassData.getClassVariables() );
        classData.setMethods( getClassData.getMethods() );
        return classData;
    }

}
