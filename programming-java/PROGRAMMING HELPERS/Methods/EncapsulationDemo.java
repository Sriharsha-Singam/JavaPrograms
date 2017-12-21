public class EncapsulationDemo
{	
	private int height;
	private int width;
	
	private void HeightWidth(int i,int j)
	{
		this.height=i;
		this.width=j;
		System.out.println("Output" + (height * width));
	}
				
	public static void main(String args[])
	{
		EncapsulationDemo ed = new EncapsulationDemo();
		ed.HeightWidth(2,4);
	}
}
