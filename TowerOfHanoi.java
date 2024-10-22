class TowerOfHanoi
{
	 static void Travel(int n, char source,char distination,char auxiliary)
	 {
	 	if(n==1){
	 		System.out.println("Move disk 1 from "+source +" to "+distination);
	 		return;
	 	}
	 	Travel(n-1,source,auxiliary,distination);
	 	System.out.println("Move disk "+n+" from "+source+" to "+ distination);
	 	Travel(n-1,auxiliary,distination,source);
	 }
	public static void main(String[] args)
	{
		int n=3;
		Travel(n,'A','C','B');
	}
}
