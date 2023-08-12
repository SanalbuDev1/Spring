package com.study.santynet.study_test;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RestController;

import com.study.santynet.study_test.dependency_injection.EngineForAtribbute;
import com.study.santynet.study_test.dependency_injection.VehicleForAtribbute;
import com.study.santynet.study_test.dependency_injection.VehicleForConstructor;
import com.study.santynet.study_test.dependency_injection.VehicleForSetter;
import com.study.santynet.study_test.qualifiers.Animal;
import com.study.santynet.study_test.qualifiers.Avion;
import com.study.santynet.study_test.qualifiers.Pajaro;
import com.study.santynet.study_test.dependency_injection.VehicleForAtribbute;

@SpringBootApplication
public class StudyTestApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext cont = SpringApplication.run(StudyTestApplication.class, args);

		// inject dependency for attribute
		VehicleForAtribbute eng = cont.getBean(VehicleForAtribbute.class);
		System.out.println(eng.toString());

		// inject dependency for constructor
		VehicleForConstructor eng2 = cont.getBean(VehicleForConstructor.class);
		System.out.println(eng2.toString());

		// inject dependency for setter
		VehicleForSetter eng3 = cont.getBean(VehicleForSetter.class);
		System.out.println(eng3.toString());

		// Qualifers
		Avion avion = cont.getBean(Avion.class);
		avion.volar("soy un avion que vuela");

		Animal anm = cont.getBean("pajaro",Animal.class);
		System.out.println(anm.getNombre());

	}

}
