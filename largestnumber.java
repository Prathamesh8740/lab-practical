package array;
//2nd largest number using array
public class largestnumber {

	public static void main(String[] args) {
		int l=0;
		int m=0;
		int [] a= {1,5,3,7};
		for(int i =0;i<a.length;i++){
			if(a[i]>l) {
				m=l;
				l=a[i];
			}
			else if(a[i]>m && a[i]!=l){
				m=a[i];
			}
		
		} 
		//l is largest number and m is 2nd largest number
		System.out.println("2nd largest number ="+ m );
			
		
	}

}
