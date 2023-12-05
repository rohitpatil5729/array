
public class twoD_Array {

	 static int[][] a= {{10,20,30},{60,40,50}};
	static int[][] b= {{15,30,45,60},{30,60,90}};
	int[] d=new int[]{100,200,300}; 
	
       public static void main(String[] args) {
		int[] c = new int[3];
		c[0] = 10;
		c[1] = 15;
		c[2] = 100;
		int[] n=new int[]{10,20,30};
		twoD_Array m=new twoD_Array();
		int g=0;
		do {
			System.out.print(m.d[g]+"  ");
			g++;
		}while(g<m.d.length);
		System.out.println();
		int j=0;
		while(j<n.length)
		{
			System.out.print(n[j]+" ");
			j++;
		}
		System.out.println();
		
		for(int z:n)
		{
			System.out.print(z+" ");
		}
		System.out.println("");
		int i;
	
		for(i=0;i<n.length;i++) {
			System.out.print(n[i]+ "     ");
		}
		System.out.println("");
		
			

	   
		System.out.println(m.d.length);
		System.out.println(c);
		System.out.println(a);
		System.out.println(a.length);
		System.out.println(a[0].length);
		System.out.println(a[0][0]);
		System.out.println(a[0][1]);
		System.out.println(a[0][2]);
		System.out.println(a[1][0]);
		System.out.println(a[1][1]);
		System.out.println(a[1][2]);
	
	}

	private static char[] c(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	private static char[] a(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}

