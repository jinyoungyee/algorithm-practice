package ch01;

/*
 * water_melon함수는 정수 n을 매개변수로 입력받습니다.
길이가 n이고, 수박수박수...와 같은 패턴을 유지하는 문자열을 리턴하도록 함수를 완성하세요.

예를들어 n이 4이면 '수박수박'을 리턴하고 3이라면 '수박수'를 리턴하면 됩니다.
*/
public class WaterMelon {
	public String watermelon(int n){
		/*String result = "";
		String su = "수";
		String bak = "박";
		for(int i=0;i<n;i++){
			if((i%2) > 0) result += bak; 
			else result += su;
		}
		System.out.println(result);
		return result;*/
		String tt = new String((new char [n/2+1]));
		
		System.out.println(tt);
		
		//String result = new String(new char [n/2+1]).replace("\0", "수박").substring(0,n);
		//System.out.println(result);
		return "";
	}
	public static void main(String[] args) {
		WaterMelon wm = new WaterMelon();
		wm.watermelon(3);
		wm.watermelon(4);
	}
}
