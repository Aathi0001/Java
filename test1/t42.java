package test1;

public class t42 {
	public static int ContainerWithMaxWater(int[] a) {
    int left = 0;
    int right = a.length - 1;
    int maxArea = 0;

    while (left < right) {
        int height = Math.min(a[left], a[right]);
        int width = right - left;
        int area = height * width;
        maxArea = Math.max(maxArea, area);

        // Move the shorter line inward
        if (a[left] < a[right]) {
            left++;
        } else {
            right--;
        }
    }

    return maxArea;
}
	public static void main(String[] args) {
		int[] a= {1,8,6,2,5,4,8,3,7};
		int res = ContainerWithMaxWater(a);
		System.out.println(res);
	}
}



/*package test1;

public class t42 {
	public static int ContainerWithMaxWater(int []a) {
		int MaxAreaTrack=0;
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				int length = Math.min(a[i], a[j]);
				int Width = j-i;
				int area = length * Width;
				MaxAreaTrack = Math.max(MaxAreaTrack,  area);
				
			}
		}return MaxAreaTrack;
	}
	
	public static void main(String[] args) {
		int[] a= {1,8,6,2,5,4,8,3,7};
		int res = ContainerWithMaxWater(a);
		System.out.println(res);
		
	}
}
*/