
public class Sum {
static void findTriplets(int[]arr,int n) {
	boolean found=true;
	for(int i=0;i<n-2;i++) {
		for(int j=i+1;j<n-1;j++) {
			for(int k=j+1;k<n;k++) {
				if(arr[i]+arr[j]+arr[k]==0) {
					System.out.println(arr[i]);
					System.out.print("");
					System.out.println(arr[j]);
					System.out.print("");
					System.out.println(arr[k]);
					System.out.println("\n");
					found=true;
				}
			}
			
		}
	}
	if(found==false) 
		System.out.println("not exit");
	}
	public static void main(String[] args) {
		int arr[]= {0,-1,1};
		int n=arr.length;
		findTriplets(arr,n);
	}
	
}


