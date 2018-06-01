public class read {
	static int value=5;
	static {
		value--;
		System.out.println("first value"+value);
	}
	public read()
	{
		value++;
		System.out.println("my value is"+value);
	}
	public static void getvalue()
	{value=+2;
	System.out.println("value is"+value);
	}
	public static void main(String args[])
	{ read.value++;
	read.getvalue();
	read read=new read();
	System.out.println("value="+value);
	
	}

}
