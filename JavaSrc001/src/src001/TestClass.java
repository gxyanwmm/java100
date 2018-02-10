package src001;
import  src001.javasrc001;
import src001.people;
import src001.gouzaojingtaiorder;

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
		
		int[][] a2 = new int[2][3];
		a2[1][2] = 100;
		System.out.println(a2[1][2]);
		
		jr.arry2(a2);
		System.out.println(a2[1][2]);
		
		int[][] a21 = new int[2][];
		a21[0] = new int[3];
		a21[1] = new int[2];
		
		a21[0][2] = 88;
		a21[1][1] = 66;
		System.out.println(a21[0][2]);
		System.out.println(a21[1][1]);
		
		people p1 = new people(101, "haha");
		people p2 = new people(102, "xixi");
		System.out.println(p1.getName());
		
		System.out.println("--------------");
		gouzaojingtaiorder gor = new gouzaojingtaiorder();
		gor.show();

	}

}
