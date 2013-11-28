package chapter14;

/**
 * @echo 2013-11-27
 * 
 */
class Position {
	private String title;
	private Person person;

	public Position(String jobTitle, Person emploee) {
		title = jobTitle;
		person = emploee;
		if (person == null)
			person = Person.NULL;
	}

	public Position(String jobTitle) {
		title = jobTitle;
		person = Person.NULL;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person newPerson) {
		person = newPerson;
		if (person == null)
			person = Person.NULL;
	}

	public String toString() {
		return "Positon: " + title + " " + person;
	}

}
