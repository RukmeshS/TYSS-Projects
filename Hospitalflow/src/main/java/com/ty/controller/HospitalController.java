package com.ty.controller;

import java.util.Arrays;
import java.util.List;
import com.ty.dao.Maindao;
import com.ty.dto.Address;
import com.ty.dto.Branches;
import com.ty.dto.Encounter;
import com.ty.dto.hospital;

public class HospitalController {

	public static void Hospitalcon() {

		// Scanner sc = new Scanner(System.in);

		Address address1 = new Address();
		address1.setLocality("1st Block");

		Address address2 = new Address();
		address2.setLocality("Sampige road");

		Address address3 = new Address();
		address3.setLocality("Mattikere");

		Branches branches1 = new Branches();
		branches1.setBranchname("Rajajinagar");
		branches1.setAddress(address1);

		Branches branches2 = new Branches();
		branches2.setBranchname("Malleswara");
		branches2.setAddress(address2);

		Branches branches3 = new Branches();
		branches3.setBranchname("Yeswanthpura");
		branches3.setAddress(address3);

		List<Branches> list = Arrays.asList(branches1, branches2, branches3);

		Encounter encounter = new Encounter();
		encounter.setBranches(list);

		hospital hospital = new hospital(); // hospital.setId(1);
		hospital.setName("Fortis");
		hospital.setBranches(list);

		Maindao dao1 = new Maindao();
		dao1.savedata(hospital); //
		// dao1.viewdatabyid(hospital.getId()); //View hospital details }

	}
}
