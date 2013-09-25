package chapter11;

import java.util.Iterator;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

/**
 * @echo 2013-9-25
 * 
 */
class PetSequence {
	protected Pet[] pets;
	public PetSequence(Pet[] pets){
		this.pets=pets;
	}
}

public class NonCollectionSequence extends PetSequence {
	/**
	 * @param pets
	 */
	public NonCollectionSequence(Pet[] pets) {
		super(pets);
	}

	public Iterator<Pet> iterator() {
		return new Iterator<Pet>() {
			private int index = 0;

			public boolean hasNext() {
				return index < pets.length;
			}

			public Pet next() {
				return pets[index++];
			}

			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}

	public static void main(String[] args) {
		NonCollectionSequence nc = new NonCollectionSequence(Pets.createArray(8));
		InterfaceVsIterator.display(nc.iterator());
	}
}
