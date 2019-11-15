public class Hello
{
public static void main( String argv[] )
	{
		//The comment has now taken the mayor of the town hostage! Oh, the humanity!
		String name = "World";
		if ( argv.length != 0 )
		{
			name = argv[0];
		}
		System.out.println( "Hello, " + name + "!" );
	}
}