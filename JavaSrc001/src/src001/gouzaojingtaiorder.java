package src001;

public class gouzaojingtaiorder {  // ˳�� ��̬����� ��������(���й��칲�� ���ȼ���) ���캯��
	
	private int num = 0;
	public gouzaojingtaiorder() //���캯��
	{
		System.out.println("���캯����ʼ��");
		this.num = 99;
	}
	
	static //��̬�����
	{
		System.out.println("��̬�����");
	}
	
	{ //��������
		System.out.println("�������� "+ (this.num = 101));
	}
	
	public void show()
	{
		System.out.println("show "+ this.num);
	}

}
