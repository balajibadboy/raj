public class Arr {
	public static void main(String args[])
	{int N=1234,t=N,i=0;
	int arr[]=new int[10];
	
	while(t>0) {
		int remainder=t%10;
		arr[i]=remainder;
		i++;
		t=t/10;
	}
	for(i=0;i<10;i++)
		System.out.println(arr[i]);
	}

}
