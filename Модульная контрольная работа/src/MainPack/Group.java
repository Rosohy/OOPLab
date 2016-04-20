package MainPack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public abstract class Group 
{
	public ArrayList<User> users;

	protected HashMap<Role, String> access;
	{
		access=new HashMap<Role, String>();
		users=new ArrayList<User>();
	}
	protected String grouppass;
	public Group()
	{
		
	}
	public boolean EnterGroup(User user, String userpass, String code)
	{
		if(code.equals(grouppass) && UserValidator.isValidUser(user, userpass))
		{
			users.add(user);
			return true;
		}
		return false;
	}
}
