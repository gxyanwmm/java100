package src001;

class javasrc001 {
	
	//函数的重载  --- java中允许进行函数重载， 只要参数个数不一致就可以
	public int Add(int a, int b)
	{
		return a+b;
	}
	
	public int Add(int x, int y, int z)
	{
		return x+y+z;
	}
	
	public void Arrys(int [] a)
	{
		for(int i=0; i<20; i++)
		{
			a[i] = 10;
		}
	}
	
	public void arry2(int[][] a2)
	{
		for(int i=0; i<2; i++)
		{
			for(int j=0;  j<3; j++)
			{
				a2[i][j] = 99;
			}
		}
		
	}
	
}
