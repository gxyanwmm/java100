package src001;
import  src001.javasrc001;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		javasrc001 jr = new javasrc001();
		
		//System.out.println(jr.Add(10, 11));
		//System.out.println(jr.Add(10, 11, 6));
		int[] ar = new int[20];    //arΪ����
		jr.Arrys(ar);  //���ж���Ĵ���
		System.out.println(ar[14]);
		ar = null;
		
		int[] ar1 = new int[10];               //ֱ�ӽ����ڴ����� �̶��ó���
		int[] ar2 = new int[]{1,2,3,4,5};   // ���볤�Ȳ��̶� �� ���г�ʼ��
		int[] ar3 = {1,2,3,4,5};                //��̬��ʼ��
		
		System.out.println( ar1[2] );
		System.out.println( ar2[3] );
		System.out.println( ar3[4] );
		

	}

}
