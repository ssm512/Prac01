package prj5ex04;

class	Pet {
	String		name;
	void		eat() {
		System.out.println(name + "(이)가 사료를 먹는다");
	} // eat() end
} // class Pet end

class Dog	extends	Pet	{
	void		bark() {
		System.out.println(name + "(이)가 멍멍");
	} //bark() end
} // class Dog end

class Cat	extends	Pet	{
	void		meow() {
		System.out.println(name + "(이)가 야옹");
	} // meow() end
} // class Cat end

class Tiger	extends	Pet	{
	void		cry() {
		System.out.println(name + "(이)가 어흥");
	} // cry() end
} // class Tiger end

public class TestAnimalInherit {
	// java에서는 extends 로 상속을 처리
	public static void main(String[] args) {
		Dog		dog		=	new	Dog();
		work(dog, "누렁이");
		//dog.name		=	"누렁이";
		//dog.eat();
		//dog.bark();
		
		Cat		nero	=	new	Cat();
		work(nero, "동이");
	} // main end

	private static void work(Pet pet, String name) {
		pet.name			=	name;
		System.out.println("work :");
		pet.eat();
		if (pet instanceof Dog)
			((Dog) pet).bark();
		if (pet instanceof Cat)
			((Cat) pet).meow();
		if (pet instanceof Tiger)
			((Tiger) pet).cry();
		
	} // work method 생성

} // class TestAnimalInherit end
