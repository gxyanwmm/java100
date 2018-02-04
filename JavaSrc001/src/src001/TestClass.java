package src001;
import  src001.javasrc001;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		javasrc001 jr = new javasrc001();
		
		//System.out.println(jr.Add(10, 11));
		//System.out.println(jr.Add(10, 11, 6));
		int[] ar = new int[20];    //ar为对象
		jr.Arrys(ar);  //进行对象的传递
		System.out.println(ar[14]);
		ar = null;
		
		int[] ar1 = new int[10];               //直接进行内存申请 固定好长度
		int[] ar2 = new int[]{1,2,3,4,5};   // 申请长度不固定 并 进行初始化
		int[] ar3 = {1,2,3,4,5};                //静态初始化
		
		System.out.println( ar1[2] );
		System.out.println( ar2[3] );
		System.out.println( ar3[4] );
		

	}

}
