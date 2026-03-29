package prj5ex02;

class Member {
	// Field
	String			name;
	String			uid;
	String			email;
	int				regYear;
	
	// Constructor
	public	Member () {}
	
	// Constructor, 인자 있는 constructor
	public Member (String n, String u, String e, int r) {
		name		=	n;
		uid			=	u;
		email		=	e;
		regYear		=	r;
	}
	
	// Method
	void		info() {
		String		fmt	=	"이름: %s\n아이디: %s\n이메일: %s\n연도: %d\n";
		
		String		msg	=	String.format(fmt, name, uid, email, regYear);
		System.out.println(msg);
	}// info () end
	
} // class Member end

public class TestMember {

	public static void main(String[] args) {
		Member			m1		=	new	Member();
		m1.name					=	"사나";
		m1.uid					=	"sana";
		m1.email				=	"sana@jyp.com";
		m1.regYear				=	2007;
		m1.info();

		Member			m2		=	new	Member();
		m2.name					=	"정연";
		m2.uid					=	"jungyeon";
		m2.email				=	"jungyeon@jyp.com";
		m2.regYear				=	2006;
		m2.info();

		Member			m3		=	new	Member();
		m3.name					=	"미나";
		m3.uid					=	"mina";
		m3.email				=	"mina@jyp.com";
		m3.regYear				=	2008;
		m3.info();
		
		System.out.println("------------------------");
		
		Member	[]		mList	=	new	Member[3];
		mList[0]				=	new	Member("사나", "sana", "sana@jyp.com", 2007);
		mList[1]				=	new	Member("정연", "jungyeon", "jungyeon@jyp.com", 2007);
		mList[2]				=	new	Member("미나", "mina", "mina@jyp.com", 2008);
		mList[0].info();
		mList[1].info();
		mList[2].info();
	} // main end

} // class TestMember end
