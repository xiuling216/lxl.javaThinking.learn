package chapter11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import typeinfo.pets.Cat;
import typeinfo.pets.Cymric;
import typeinfo.pets.Dog;
import typeinfo.pets.Mutt;
import typeinfo.pets.Person;
import typeinfo.pets.Pet;

/**
 * @echo 2013-9-24
 * Map π”√
 */
public class MapOfList {
	public static Map<Person, List<? extends Pet>> petPeople = new HashMap<Person, List<? extends Pet>>();
	static {
		petPeople.put(new Person("Dawn"),
				Arrays.asList(new Cymric("Molly"), new Mutt("Spot")));
		petPeople.put(new Person("Kate"), Arrays.asList(new Cat("Shackleton"),
				new Cat("Elisie"), new Dog("Margett")));
		petPeople.put(new Person("Echo"), Arrays.asList(new Cat("snow"),
				new Cat("sunny"), new Dog("sandy")));
	}

	public static void main(String[] args) {
		System.out.println("People:"+petPeople.keySet());
		System.out.println("Pets:"+petPeople.values());
		for(Person p:petPeople.keySet()){
			System.out.print(p+" has: ");
			for(Pet pet:petPeople.get(p))
				System.out.print(pet+" / ");
			System.out.println();
		}
	}

}
