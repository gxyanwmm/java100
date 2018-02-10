package src001;

public class people {
	
	private int id;
	private String name;
	
	{
		System.out.println("构造代码块");
	}
	
	public people()
	{
	}
	public people(int id)
	{
		this.id = id;
	}

	public people(int id, String name)
	{
		this(id); //构造函数间 this方法的调用 ---- 只能放再构造函数的第一行 规则
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


}
