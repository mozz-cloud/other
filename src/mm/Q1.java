package mm;

public class Q1 {

	public static void main(String[] args) {
		System.out.println(isStepped(new int[] {1, 1, 1, 5, 5, 5, 5, 8, 8, 8}));
		System.out.println(isStepped(new int[] {1, 1, 5, 5, 5, 5, 8, 8, 8}));
		System.out.println(isStepped(new int[] {3, 3, 3, 2, 2, 2, 5, 5, 5}));
		System.out.println(isStepped(new int[] {5, 5, 5, 15}));
		
		
	}

	public static int isStepped(int[ ] a) {
		int c = 0;
		for(int i=0; i<a.length-1; i++) {
				if(a[i] > a[i+1])
					return 0;
				else if(a[i] == a[i+1])
					c++;
				else {
					if(c < 2)
						return 0;
					c = 0;
				}	
		}
			
		return 1;		
	}
}
