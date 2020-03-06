class Sudha
{
	private Object[] Array=new Object[10];
	private int elemcount=0;
	private void add(Object obj)
	{
		if(elemcount==Array.length)
		{
			increaseCapacity();
		}
		Array[elemcount]=obj;
		elemcount++;
	}
	public void increaseCapacity()
	{
		int newCapacity=Array.length*2;
		Object[] nextArray=new Object[newCapacity];
		for(int i=0;i<Array.length;i++)
		{
			nextArray[i]=Array[i];
		}
		Array=nextArray;
	}
	public int capacity()
	{
		return Array.length;
	}
	public int size()
	{
		return elemcount;
	}
	
	public Object get(int index)
	{
		if(index<0||index>=size())
		{
			System.out.println("IndexOutOfBound Exception");
		}
		return Array[index];
	}
	public void replace(int index,Object obj)
	{
		if(index<0||index>=size())
		{
			System.out.println("IndexOutOfBound Exception");
		}
		Array[index]=obj;
	}
	public void remove(int index)
	
	{
		
		if(index<0||index>=size())
		{
			System.out.println("IndexOutOfBound Exception");
		}
		while(index<size()-1)
		{
			Array[index]=Array[index+1];
			index++;
		}
		Array[index]=null;
		elemcount--;
	}
	public void insert(int index,Object obj)
	{
		
		if(index<0||index>=size())
		{
			System.out.println("IndexOutOfBound Exception");
		}
		if(size()==capacity())
		{
			increaseCapacity();
		}
		for(int i=size()-1;i>=index;i--)
		{
			Array[i++]=Array[i];
		}
		Array[index]=obj;
		elemcount++;
	}
	public void display(Object obj)
	{	
		System.out.println("Elements in the list");
		for(int i=0;i<size();i++)
		{
			System.out.println(Array[i]);
		}
	}
	public static void main(String args[])
	{
 		Sudha s=new Sudha();
		s.add("4");
		s.add("3");
		s.add("15");
		s.add("17");
		s.add("1");
		s.add("2");
		s.add("5");
		s.add("12");
		s.add("6");
		s.add("8");
		s.display(s);
	}		
			
}
 

















