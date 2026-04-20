package com.nt.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final public class CustomImmutableClass {

	private final String name;
	private final int age;
	private final List<String> hobbies;
	private final Map<String, Integer> skillset;

	public CustomImmutableClass(String name, int age, List<String> hobbies, Map<String, Integer> skillset) {
		this.name = name;
		this.age = age;

		List<String> tempList = new ArrayList<>();
		for (String hobby : hobbies) {
			tempList.add(hobby);
		}
		this.hobbies = tempList;

		Map<String, Integer> tempMap = new HashMap<String, Integer>();
		for (Map.Entry<String, Integer> entry : skillset.entrySet()) {
			tempMap.put(entry.getKey(), entry.getValue());
		}
		this.skillset = tempMap;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public List<String> getHobbies() {
		List<String> tempList = new ArrayList<>();
		for (String hobby : hobbies) {
			tempList.add(hobby);
		}
		return tempList;
	}

	public Map<String, Integer> getSkillset() {
		Map<String, Integer> tempMap = new HashMap<>();
		for (Map.Entry<String, Integer> entry : skillset.entrySet()) {
			tempMap.put(entry.getKey(), entry.getValue());
		}
		return tempMap;
	}

	@Override
	public String toString() {
		return "Test [ " + name + ", " + age + ", " + hobbies + ", " + skillset + " ]";
	}

	public static void main(String[] args) {

		List<String> hobbies = new ArrayList<>();
		hobbies.add("Cricket");
		hobbies.add("FoosBall");
		Map<String, Integer> skillset = new HashMap<>();
		skillset.put("java", 12);
		skillset.put("SpringBoot", 8);
		CustomImmutableClass t1 = new CustomImmutableClass("Nazeer", 35, hobbies, skillset);
		System.out.println(t1);

		System.out.println("Before: " + t1.getHobbies());
		hobbies.add("Surfing");
		System.out.println("After: " + t1.getHobbies());

		System.out.println("Before: " + t1.getSkillset());
		skillset.put("Microservices", 6);
		System.out.println("After: " + t1.getSkillset());

	}

}
