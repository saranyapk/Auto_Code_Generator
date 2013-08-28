package exception;

public class BillAutoCodeGenerateException extends Exception
{
    private static final long serialVersionUID = 1L;

    public BillAutoCodeGenerateException( String str )
    {
        super( str );
    }

    public BillAutoCodeGenerateException( Throwable t )
    {
        super( t );
    }

    public BillAutoCodeGenerateException( String message, Throwable cause )
    {
        super( message, cause );
    }
}
