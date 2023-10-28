import java.util.Scanner;

class Six{

	public static boolean check(int[] arr, int a, int b, int c, int n2){
		boolean yeet=true;
		for(int i=0;i<4;i++){
			if(i!=a&&i!=b&&i!=c){
				for(int j=i+1;j<5;j++){
					if(j!=a&&j!=b&&j!=c){
						for(int k=j+1;k<6;k++){
							if(k!=a&&k!=b&&k!=c){
								if(arr[i]+arr[j]+arr[k]==n2){
									yeet=false;
								}
							}
						}
					}
				}
			}
		}
		return yeet;
	}

	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		int[] arr=new int[6];
		System.out.println("Enter the numbers: ");
		for(int i=0;i<6;i++){
			arr[i]=in.nextInt();
		}
		System.out.println("Enter the target numbers: ");
		int n1=in.nextInt();
		int n2=in.nextInt();
		boolean ans=true;
		for(int i=0;i<4;i++){
			if(ans){
				for(int j=i+1;j<5;j++){
					if(ans){
						for(int k=j+1;k<6;k++){
							if((arr[i]+arr[j]+arr[k]==n1)&&ans){
								ans= check(arr, i, j, k, n2);
								System.out.println(arr[i]+" "+arr[j]+" "+arr[k]+" "+"= "+n1);
							}
						}
					}
				}
			}		
		}
	}
}