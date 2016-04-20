package MainPack;

public abstract class Role 
{
	protected String codeword;
	public abstract DocFetcher GetDocument( int index, String code, User user, String userpass  );
}
