package src001;

public class gouzaojingtaiorder {  // 顺序： 静态代码块 构造代码块(具有构造共性 优先级高) 构造函数
	
	private int num = 0;
	public gouzaojingtaiorder() //构造函数
	{
		System.out.println("构造函数初始化");
		this.num = 99;
	}
	
	static //静态代码块
	{
		System.out.println("静态代码块");
	}
	
	{ //构造代码块
		System.out.println("构造代码块 "+ (this.num = 101));
	}
	
	public void show()
	{
		System.out.println("show "+ this.num);
	}

}
