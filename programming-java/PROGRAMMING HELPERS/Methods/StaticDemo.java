public class StaticDemo
{	
	private int height;
	private int width;
	static int Globe=0;
	//int Globe=0;
	private void HeightWidth(int i,int j)
	{
		this.height=i;
		this.width=j;
		System.out.println("Output" + (height * width));
	}
	
	public static void TestMe(int Globe)
	//public void TestMe(int Globe)
	{
		Globe=Globe;
	}	
	
	public static void SetTestMe(int value)
	//public void SetTestMe(int value)
	{
		Globe=value;
	}
		
	public static void main(String args[])
	{
		StaticDemo ed = new StaticDemo();
		ed.TestMe(2);
		System.out.println("Globe Before Set " + Globe);
		ed.SetTestMe(21);
		System.out.println("Globe After Set " + Globe);
	}
}
