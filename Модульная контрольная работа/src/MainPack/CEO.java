package MainPack;

public final class CEO extends Group {

	private static CEO self;
	public static CEO  getCEO()
	{
		if(self!=null) return self;
		else return new CEO();
		
	}
	private CEO() {
		super();
		grouppass="King";
		access.put(Admin.getAdmin(), "qwerty");
	}
	public DocFetcher GetDocument(int index,User user, String userpass)
	{
		return Admin.getAdmin().GetDocument(index, access.get(Admin.getAdmin()), user, userpass);
	}
	

}
