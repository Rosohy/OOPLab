package project;

import java.util.ArrayList;

public class FindBill implements CustomLineRequirements {

	@Override
	public boolean checkLine(ArrayList<Pair<String, Object>> line) 
	{
		for(Pair<String, Object> q : line)
		{
			if(q.getFirst().equalsIgnoreCase("NAME") && ((String)q.getSecond()).equals("Bill")) return true;
		}
		return false;
	}

}
