package prj5ex03;

class Dog {
	String		name;
	void		eat() {
		System.out.println(name + "(이)가 사료를 먹는다");
	} // eat() method
	void		bark() {
		System.out.println(name + "(이)가 멍멍");
	} // bark() method
	
} // class Dog end

class Cat {
	String		name;
	void		eat() {
		System.out.println(name + "(이)가 사료를 먹는다");
	} // eat() method
	void		meow() {
		System.out.println(name + "(이)가 야옹");
	} // meow() method
} // class Cat end

public class TestAnimal {

	public static void main(String[] args) {
		Dog			chu		=	new	Dog();
		chu.name			=	"츄";
		chu.eat();
		chu.bark();
		
		Cat			nero	=	new	Cat();
		nero.name			=	"네로";
		nero.eat();
		nero.meow();

	} // main end

} // class TestAnimal end
