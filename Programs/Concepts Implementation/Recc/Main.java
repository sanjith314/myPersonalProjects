class Main{
	public static int recc(int n){
		if(n>0)
		return n*recc(n-1);
		else
			return 1;
	}
	public static void main(String[] args){
		int n=5;
		System.out.println(recc(n));
	}
}