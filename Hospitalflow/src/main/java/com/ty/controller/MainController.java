package com.ty.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.ty.dao.Maindao;
import com.ty.dto.Address;
import com.ty.dto.Branches;
import com.ty.dto.Encounter;
import com.ty.dto.Meditems;
import com.ty.dto.Medorder;
import com.ty.dto.Person;
import com.ty.dto.hospital;

public class MainController {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean condition = true;
		while (condition) {
			System.out.println("Enter 1-To Hospital Update\n      2-To Update Person\n      3-To view details");
			int option = sc.nextInt();

			switch (option) {
			case 1:

				
				boolean value = true;
				while (value) {
					
					hospital hospital = new hospital();

					System.out.println("Enter Hospital Name \n");
					hospital.setName(sc.next());

					
					Branches branches = new Branches();
					System.out.println("Enter Hospital Branch Name \n ");
					branches.setBranchname(sc.next());
					List<Branches> list = Arrays.asList(branches);

					Address address = new Address();
					System.out.println("Enter Hospital Branch Address  \n");
					address.setLocality(sc.next());

					hospital.setBranches(list);
					branches.setAddress(address);

					Maindao dao1 = new Maindao();
					dao1.savedata(hospital);

					System.out.println("Enter 1-For Conitnue Update\n      2-For Exit update");
					if (sc.nextInt() == 1) {
						value = true;
					} else {
						value = false;
					}
				}

				break;

			case 2:

				boolean value1 = true;
				while (value1) {

					Person person = new Person();
					Encounter encounter = new Encounter();
					Medorder medorder = new Medorder();
					Meditems meditems = new Meditems();
					Maindao dao = new Maindao();

					System.out.println("Enter Person name \n");
					person.setName(sc.next());
					System.out.println("Enter Person age \n");
					person.setAge(sc.nextInt());
					System.out.println("Enter Person phone \n");
					person.setPhone(sc.nextLong());
					System.out.println("Enter Person address \n");
					person.setAddress(sc.next());

					System.out.println("Enter Reason for admission \n");
					encounter.setReason(sc.next());
					encounter.setBranches(dao.Branchfind());
					List<Encounter> list5 = Arrays.asList(encounter);

					System.out.println("Enter prescription  \n");
					medorder.setPrec_name(sc.next());
					System.out.println("Enter Numbers to be taken \n");
					medorder.setNummbers(sc.nextInt());
					System.out.println("Enter Duration of prescription \n");
					medorder.setDuration(sc.nextInt());
					List<Medorder> list1 = Arrays.asList(medorder);

					System.out.println("Enter Quantity of prescription \n");
					meditems.setQuntity(sc.nextInt());
					System.out.println("Enter Price of prescription \n");
					meditems.setPrice(sc.nextInt());
					System.out.println("Enter TotalPrice of prescription \n");
					meditems.setTotal(sc.nextInt());
					List<Meditems> list2 = Arrays.asList(meditems);

					person.setEncounter(list5);
					encounter.setMedorder(list1);
					medorder.setMeditems(list2);

					dao.Personsave(person);

					System.out.println("Enter 1-For Conitnue Update\n      2-For Exit update\n");
					if (sc.nextInt() == 1) {
						value1 = true;
					} else {
						value1 = false;
					}
				}

				break;

			case 3:

				boolean value2 = true;
				while (value2) {

					hospital hospital1 = new hospital();
					Person person = new Person();
					Maindao dao = new Maindao();
					int a;
					System.out.println(
							"Type for 1-To View Person Details\n         2-To View Hospital Details\n         3-Exit");
					a = sc.nextInt();
					if (a == 1) {
						System.out.println("Please proivde Person ID");
						person.setId(sc.nextInt());
						dao.viewdatabypersonid(person.getId());
					}
					if (a == 2) {
						System.out.println("Please proivde Hospital ID");
						hospital1.setId(sc.nextInt());
						dao.viewdatabyid(hospital1.getId());
					} else {
						value2 = false;
					}
					System.out.println("Enter 1-For Conitnue View\n      2-For Exit\n");
					if (sc.nextInt() == 1) {
						value2 = true;
					} else {
						value2 = false;
					}
				}

			default:
				condition = false;
				break;
			}
			condition = true;
		}

	}
}
