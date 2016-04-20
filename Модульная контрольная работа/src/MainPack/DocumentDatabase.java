package MainPack;

import java.util.ArrayList;
import java.util.HashMap;

public final class DocumentDatabase 
{
	private static DocumentDatabase self;
	public static DocumentDatabase getDB()
	{
		if(self!=null) return self;
		else return new DocumentDatabase();
	}
	private HashMap<Role, String> passwords;
	private ArrayList<Document> docs;
	{
		docs=new ArrayList<Document>();
		passwords=new HashMap<Role,String>();
		passwords.put(Admin.getAdmin(),"qwerty");
		
	}
	private DocumentDatabase()
	{
		
	}
	public void addFile(Document a)
	{
		docs.add(a);
	}
	
	public AllRightsDoc fetchDoc(int index, Admin role, String pass, User user, String userpass )
	{
		if(passwords.get(role).equals(pass) && UserValidator.isValidUser(user, userpass))
		{
			try
			{
				return (AllRightsDoc)docs.get(index);
			}
			catch(Exception e)
			{
				return null;
			}
		}
		else return null;
	}


}
