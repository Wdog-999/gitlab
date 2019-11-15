public class Hello2
{
public static void main( String argv[] )
	{
		String name = "Za Warudo";
		if ( argv.length != 0 )
		{
			name = argv[0];
		}
		System.out.println( "Hello, " + name + "!" );
	}
}