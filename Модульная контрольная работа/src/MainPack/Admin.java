package MainPack;

public final class Admin extends Role 
{
	
	private static Admin self;
	public static Admin  getAdmin()
	{
		if(self!=null) return self;
		else return new Admin();
		
	}
	public AllRightsDoc GetDocument( int index, String code, User user, String userpass )
	{
		if(code==this.codeword)
		return DocumentDatabase.getDB().fetchDoc(index, this, codeword, user, userpass);
		else return null;
	}
	private Admin() 
	{
		super();
		codeword="qwerty";
	}

}
