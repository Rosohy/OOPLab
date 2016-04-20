package MainPack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class User {
	private HashMap<Group, String> password;
	public ArrayList<Group> mygroups;
	public User() {
		// TODO Auto-generated constructor stub
	}
	private String InputPass()
	{
		System.out.println("Enter Password");
		/*Scanner a=new Scanner(io);
		return a.nextLine();*/
		return "sometext";
	}
	public void addToGroup(Group a, String codeword)
	{
		
		String s=InputPass();
		if(CEO.getCEO().EnterGroup(this, s, codeword))
		{
			mygroups.add(a);
			password.put(a,codeword);
		}
		
	}
	

}
