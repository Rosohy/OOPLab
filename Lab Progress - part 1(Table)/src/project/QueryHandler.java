package project;

import java.util.ArrayList;
import java.util.LinkedList;

public class QueryHandler 
{
	private int targetVersion;
	private Table target;
	CustomLineRequirements requirment;
	private boolean colsAreSet, reqsAreSet;
	protected ArrayList<String> colnames;
	{
		colsAreSet=false;
		reqsAreSet=false;
		colnames=new ArrayList<String>();
	}
	public void setNames(ArrayList<String> names)//e
	{
		if(colsAreSet) return;
		colsAreSet=true;
		for(String q : names)
		{
			if(target.containsName(q)) colnames.add(q);
		}
		
	}
	public void setRequirments(CustomLineRequirements reqs)
	{
		reqsAreSet=true;
		requirment=reqs;
		
	}
	public QueryHandler(Table s)
	{
		target=s;
		targetVersion=s.getVersion();
	}
	public Table ResolveQuery()
	{
		Table ans=new Table(colnames);
		{
			LinkedList<ArrayList<Pair<String, Object> >> data=target.getData();//L
			for(ArrayList<Pair<String, Object> > q : data)
			{
				if(requirment.checkLine(q))
				{
					ans.addLine(q);
				}
			}
		}
		return ans;
	}
}
