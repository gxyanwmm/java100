package src001;

public class people {
	
	private int id;
	private String name;
	
	{
		System.out.println("��������");
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
		this(id); //���캯���� this�����ĵ��� ---- ֻ�ܷ��ٹ��캯���ĵ�һ�� ����
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
