package prj5ex01;

public class TestCalc {

	public static void main(String[] args) {
		int			n1		=	7;
		int			n2		=	2;
		int			result;
		result				=	add(7,2);
		System.out.println(result);
		
		result				=	add(n1,n2,5);
		System.out.println(result);

	} // main end

	private static int add(int v1, int v2, int v3) {
		return v1 + v2 + v3;
	} // overloading
	// 객체지향 언어는 parameter type, 갯수가 다른면 같은 이름의 함수를 사용할 수 있음

	private static int add(int v1, int v2) {
		return v1	+	v2;
	} // add ()

} // class TestCalc end
