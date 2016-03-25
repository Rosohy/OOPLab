package project;

import java.io.*;
import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) 
	{
		ArrayList<String> a=new ArrayList<String>();
		a.add("NAME");
		a.add("AGE");
		Table gr=new Table(a);
		ArrayList<Pair<String,Object> > inp=new ArrayList<Pair<String,Object> >();
		inp.add(new Pair<String, Object>("NAME", "Bill"));
		inp.add(new Pair<String, Object>("AGE", 21));
		gr.addLine(inp);
		inp=new ArrayList<Pair<String,Object> >();
		inp.add(new Pair<String, Object>("NAME", "Tom"));
		inp.add(new Pair<String, Object>("AGE", 10));
		gr.addLine(inp);
		QueryHandler u=new QueryHandler(gr);
		a=new ArrayList<String>();
		a.add("AGE");
		u.setNames(a);
		FindBill billy=new FindBill();
		u.setRequirments(billy);
		gr.ConsolePrint();
		u.ResolveQuery().ConsolePrint();
		
		
		
		

	}

}
