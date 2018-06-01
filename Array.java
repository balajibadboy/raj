public class Array{
	public static void main(String args[])
	{
	int arr[]=new int[10];
	int i,j,temp;
	Scanner sc=new Scanner(System.in);
	//System.out.println("Enter the size");
	//5
	int b=sc.nextInt();
	System.out.println("Enter the numbers");;
	for(i=0;i<6;i++)
	{
	arr[i]=sc.nextInt();
	}
	j=i-1;
	i=0;
	while(i<j)
	{
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		i++;
		j--;
	}
	System.out.println("Reverse of Array:\n");
	for(i=0;i<10;i++)
	{System.out.println(arr[i]+" ");
	}
	}}
	