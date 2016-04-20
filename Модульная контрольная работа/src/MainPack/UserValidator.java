package MainPack;

import java.util.HashMap;

public final class UserValidator {

	private static HashMap<User, String> protection;
	{
		protection=new HashMap<User,String>();
	}
	private UserValidator() {
	}
	public static boolean isValidUser(User user, String pass)
	{
		if(protection.get(user).equals(pass)) return true; else return false;
	}
	

}
