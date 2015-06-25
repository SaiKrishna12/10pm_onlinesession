package day4;

public class Arrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a={10,34,56,71,4,2,12};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("#########");
		int[] b=new int[4];
		b[0]=100;
		b[1]=200;
		b[2]=345;
		b[3]=987;
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
	}

}
