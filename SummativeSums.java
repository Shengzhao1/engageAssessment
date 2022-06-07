
public class SummativeSums {
	public static int count(int[] a) {
		int reusult = 0;
		for(int number: a) {
			reusult = reusult +number;
					
		}
		return reusult;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] one = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
		int[] two = { 999, -60, -77, 14, 160, 301 };
		int [] three = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99 } ;
		System.out.println("#1 Array Sum:"+count(one));
		System.out.println("#2 Array Sum:"+count(two));
		System.out.println("#3 Array Sum:"+count(three));


	}

}
