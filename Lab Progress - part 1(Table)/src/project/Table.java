package project;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Table 
{
	protected int cols, version;
	protected LinkedList<Object[]> data;
	
	protected Hashtable< String, Integer > keys;
	protected ArrayList<String> colnames;
	LinkedList<ArrayList<Pair<String, Object> >> getData()
	{
		LinkedList<ArrayList<Pair<String, Object> >> newdata=new LinkedList<ArrayList<Pair<String, Object> >>();
		for(Object[] q : data)
		{
			ArrayList<Pair<String,Object>> t=new ArrayList<Pair<String,Object>>();
			for(int i=0;i<q.length;++i)
			{
				t.add(new Pair<String,Object>(colnames.get(i),q[i]));
			}
			newdata.add(t);
		}
		return newdata;
	}
	public boolean containsName(String name)
	{
		for(String q : colnames)
		{
			if(name.equalsIgnoreCase(q)) return true;
		}
		return false;
	}
	public int getVersion()
	{
		return version;
	}
	public Table(ArrayList<String> colname)
	{
		colname.trimToSize();
		keys=new Hashtable<String, Integer>();
		data=new LinkedList<Object[]>();
		this.cols=colname.size();
		version=0;
		colnames=(ArrayList<String>)colname.clone();	
		initKeys();
	}
	protected void initKeys()
	{
		for(int i=0;i<cols;++i)
		{
			keys.put(colnames.get(i),i);
		}
	}
	public void addLine(ArrayList<Pair<String, Object> > input)
	{
		++version;
		Object[] tem=new Object[cols];
		int len=input.size();
		for(int i=0;i<len;++i)
		{
			String name=input.get(i).getFirst();
			if(containsName(name))
			tem[keys.get(name)]=input.get(i).getSecond();
		}
		data.add(tem);
	}
	public void ConsolePrint()
	{
		for(int i=0;i<cols;++i)
		{
			System.out.print(colnames.get(i)+" ");
			
		}
		System.out.println();
		ListIterator<Object[]> lite=data.listIterator();
		while(lite.hasNext())
		{
			Object[] line=lite.next();
			for(int i=0;i<cols;++i)
			{
				if(line[i]==null) System.out.print(null+" "); 
				else System.out.print(line[i].toString()+" ");
				
				
			}

			System.out.println();
		}
		
	}
}
