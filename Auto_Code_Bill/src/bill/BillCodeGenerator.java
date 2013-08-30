package bill;

import main.AutoCodeGenerator;
import writer.ClassWriter;
import bill.components.*;
import codesnippet.ClassDataPopulator;
import configuration.Configuration;
import exception.BillAutoCodeGenerateException;

public class BillCodeGenerator
{
    private Configuration config = null;
    private ClassDataPopulator classDataPopulator = null;
    private ClassWriter classWriter = null;

    public BillCodeGenerator()
    {
        this.config = AutoCodeGenerator.config;
        this.classDataPopulator = new ClassDataPopulator();
        this.classWriter = new ClassWriter();
    }

    public void generate() throws BillAutoCodeGenerateException
    {
        if ( config.isQueryProcessorRequired() )
        {
            classWriter.write( classDataPopulator.populateNGetClassData( new QueryProcessor() ) );

        }
        if ( config.isDelta() )
        {
            classWriter.write( classDataPopulator.populateNGetClassData( new DeltaBillComponent() ) );
        }
        else
        {
            classWriter.write( classDataPopulator.populateNGetClassData( new NonDeltaBillComponent() ) );
        }

        classWriter.write( classDataPopulator.populateNGetClassData( new BirtComponent() ) );
        
        classWriter.write( classDataPopulator.populateNGetClassData( new HelperComponent() ) );

    }
}
