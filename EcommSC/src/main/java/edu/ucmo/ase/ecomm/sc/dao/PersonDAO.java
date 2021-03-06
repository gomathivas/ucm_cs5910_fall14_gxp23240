package edu.ucmo.ase.ecomm.sc.dao;

import java.util.List;

import edu.ucmo.ase.ecomm.sc.domain.Person;


public interface PersonDAO {

	public void addPerson(Person p);
	public void updatePerson(Person p);
	public List<Person> listPersons();
	public Person getPersonById(int id);
	public void removePerson(int id);
}
