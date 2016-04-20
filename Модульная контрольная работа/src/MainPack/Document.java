package MainPack;

import java.util.ArrayList;

public class Document 
{
	private ArrayList<File> files;
	{
		files=new ArrayList<File>();
	}
	public Document()
	{
		
	}
	public void addFile(File a)
	{
		files.add(a);
	}
	public File accessFile(int index)
	{
		try
		{
			return files.get(index);
		}
		catch(Exception e)
		{
			return new File(null);
		}
	}
}
