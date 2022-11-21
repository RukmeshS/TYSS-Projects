package com.ty.controller;

import java.util.Arrays;
import java.util.List;
import com.ty.dao.Maindao;
import com.ty.dto.Encounter;
import com.ty.dto.Meditems;
import com.ty.dto.Medorder;
import com.ty.dto.Person;

public class PersonMainController {

	public static void Personcon() {

		// Scanner sc = new Scanner(System.in);

		Meditems meditems1 = new Meditems(); // Meditems Update
		meditems1.setQuntity(12);
		meditems1.setPrice(4);

		Meditems meditems2 = new Meditems();
		meditems2.setQuntity(9);
		meditems2.setPrice(10);
		meditems2.setTotal(138);
		List<Meditems> list2 = Arrays.asList(meditems1, meditems2);

		Medorder medorder = new Medorder(); // Med prescription Update
		medorder.setPrec_name("Vicks");
		medorder.setNummbers(2);
		medorder.setDuration(3);
		medorder.setMeditems(list2);
		List<Medorder> list1 = Arrays.asList(medorder);

		Encounter encounter = new Encounter(); // Hospital admission Update
		encounter.setReason("Cold");
		encounter.setMedorder(list1);
		List<Encounter> list5 = Arrays.asList(encounter);

		Person person = new Person();
		// person.setId(1);
		person.setName("Amit");
		person.setAge(29);
		person.setPhone(123456);
		person.setAddress("Mahalakshmi layout");
		person.setEncounter(list5);

		Maindao dao = new Maindao();
		dao.Personsave(person);
		// dao.viewdatabypersonid(person.getId()); //View Person details

		// HospitalController.Hospitalcon(); //calling Hospital class

	}

}
