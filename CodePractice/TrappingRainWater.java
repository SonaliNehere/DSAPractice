package Practice;

public class TrappingRainWater {
	public static void trappingRainWater(int arr[]) {
		int res = 0;
		int lm = 0;
		int rm = 0;
		for(int i=1; i<arr.length-1; i++) {
			lm =0;
			rm = 0;	
			int k=i-1;
			while(k>=0) {
				if(arr[k]>lm && arr[k]>arr[i]) {
					lm=arr[k];
					System.out.println("lm of " + arr[i] + " : "  + lm );
				}
				k--;
			}
			
			int j = i+1;
			while(j<arr.length) {
				if(arr[j]>rm && arr[j]>arr[i]) {
					rm = arr[j];
					System.out.println("rm of " + arr[i] + " : "  + rm );
				}
				j++;
			}
			if(arr[i]<lm && arr[i]<rm) {
					res += Math.min(lm, rm) - arr[i];
					System.out.println("res of " + arr[i] + " : "  + (Math.min(lm, rm) - arr[i]));
					
			}
			System.out.println();
			
			
		}
		System.out.println(res);
	}
	
	public static void trappingRainWaterNTimeComplexity(int height[]) {
		int res = 0;
        int n=height.length;
		 int lm[] = new int[n];
	        int rm[] = new int[n];
	        lm[0] = height[0];
	        for(int i=1; i<n-1; i++){
	            if(height[i]>lm[i-1]){
	                lm[i] = height[i];
	            }
	            else{
	                lm[i] = lm[i-1];
	            }
	        }
	        rm[n-1] = height[n-1];
	        for(int i=n-2; i>0; i--){
	            if(height[i]>rm[i+1]){
	                rm[i] = height[i];
	            }
	            else{
	                rm[i] = rm[i+1];
	            }
	        }

	        for(int i=1; i<n-1; i++){
	            if(height[i]<lm[i] && height[i]<rm[i]){
	                 res += (Math.min(lm[i], rm[i])-height[i]);
	            } 
	        }
	        System.out.println(res);
	}
	

	public static void main(String[] args) {
//		int arr[] = {2,0,2};
//		int arr[] = {1,2,3};
//		int arr[] = {3,0,1,2,5};
//		int arr[] = {1,2,3,0,4,3,2,4};
		int arr[] = {1,2,1,1,3,0,2,3};
		trappingRainWater(arr);
		trappingRainWaterNTimeComplexity(arr);

	}

}
