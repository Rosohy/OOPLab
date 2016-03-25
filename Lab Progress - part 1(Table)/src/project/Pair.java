package project;

public class Pair<V, K> 
{
	private V first;
	private K second;
	public Pair(V obj1, K obj2)
	{
		first=obj1;
		second=obj2;
	}
	public V getFirst()
	{
		return first;
	}
	public K getSecond()
	{
		return second;
	}
}
