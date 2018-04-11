package kr.co.infopub.chapter.s018;
// 타입변환의 필요성
public class JavaTypeCoversion {
	public static void main(String[] args) {
		String slat=" 37.52127220511242     ";
		//String slat="hello";
		//공백 제거후 double로 타입변환
		double latitude=Double.parseDouble(slat.trim()); 
		System.out.println(latitude);
	}
}
