package com.java.collection.eigthex;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;
public class ProductionFacilityDemo {
public static void main(String[] args) {
		
		ProductionFacility pd1 = new ProductionFacility(101, "Developement", "wardha", 12,
				new String[] { "abc", "def", "aaa", "mmm", "nnnnn", "gdttyuio" }, LocalDate.of(2022, 8, 30));
		ProductionFacility pd2 = new ProductionFacility(102, "Developement", "yavatmal", 13,
				new String[] { "pqr", "stu", "etryy", "uytrf" }, LocalDate.of(2022, 8, 29));
		ProductionFacility pd3 = new ProductionFacility(103, "Developement", "kanpur", 14, new String[] { "vwx", "yz" },
				LocalDate.of(2022, 8, 28));

		// pfFacility2
		ProductionFacility pd11 = new ProductionFacility(201, "Testing", "amravati", 11, new String[] { "abc", "def" },
				LocalDate.of(2022, 8, 20));
		ProductionFacility pd12 = new ProductionFacility(202, "Testing", "washim", 12,
				new String[] { "pqr", "stu", "uytfd", "yfd", "kjhtr", "uytrfd" }, LocalDate.of(2022, 8, 19));
		ProductionFacility pd13 = new ProductionFacility(203, "Testing", "buldhana", 13, new String[] { "vwx", "yz" },
				LocalDate.of(2022, 8, 18));

		// pfFacility3
		ProductionFacility pd21 = new ProductionFacility(301, "Production", "shegaon", 22,
				new String[] { "abc", "def" }, LocalDate.of(2022, 8, 10));
		ProductionFacility pd22 = new ProductionFacility(302, "Production", "nagpur", 3, new String[] { "pqr", "stu" },
				LocalDate.of(2022, 8, 9));
		ProductionFacility pd23 = new ProductionFacility(303, "Production", "jalgaon", 14, new String[] { "vwx", "yz" },
				LocalDate.of(2022, 8, 8));

		ArrayList<ProductionFacility> list = new ArrayList<>();
		list.add(pd1);
		list.add(pd2);
		list.add(pd3);

		list.add(pd11);
		list.add(pd12);
		list.add(pd13);

		list.add(pd21);
		list.add(pd22);
		list.add(pd23);

		// Print the details of facility with highest production per day. (you
		// have to
		// add at least 3 days details of each facility after that you have to
		// calculate
		// average of 3 days on the basis of average you have to print the
		// facility with
		System.out.println(" detail of facility on the Item of name");
		HighestItem(list);
		

		System.out.println(" detail of facility on the basis of highest production");
		Collections.sort(list, new Comparator<ProductionFacility>() {

			@Override
			public int compare(ProductionFacility o1, ProductionFacility o2) {
				int pftppd1 = o1.getTotalproduction_perday();
				int ptppd2 = o2.getTotalproduction_perday();
				return pftppd1-ptppd2;
			}
		});
		System.out.println(list);
		highestProduction(list);
		// Print detail of facility on the basis of names
		
		
		
System.out.println(" detail of facility on the basis of name");

Collections.sort(list, new Comparator<ProductionFacility>() {

	@Override
	public int compare(ProductionFacility o1, ProductionFacility o2) {
		String pfName1 = o1.getPro_facility_name();
		String pfName2 = o2.getPro_facility_name();
		return pfName1.compareTo(pfName2);
	}
});
System.out.println(list);
		
		

		


System.out.println(" detail of facility on the basis of name");	

Collections.sort(list, new Comparator<ProductionFacility>() {

	@Override
	public int compare(ProductionFacility o1, ProductionFacility o2) {
		LocalDate pfdate1 = o1.getProd_date();
		LocalDate pfdate2 = o2.getProd_date();
		return pfdate1.compareTo( pfdate2);
	}
});
System.out.println(list);


	}
private static void HighestItem(ArrayList<ProductionFacility> list) {
	HashMap<String, Integer> map = new HashMap<>();
	int length = 0;
	int val = 0;
	String facName = "";
	for (ProductionFacility pf : list) {
		length = pf.getItemnames().length;
		System.out.println("length=" + length);
		if (map.containsKey(pf.getPro_facility_name())) {
			val = map.get(pf.getPro_facility_name());
			if (val > length) {
				map.put(pf.getPro_facility_name(), val);
			} else {
				map.put(pf.getPro_facility_name(), length);
			}
		} else {
			map.put(pf.getPro_facility_name(), length);
		}
	}

	for (Entry<String, Integer> m : map.entrySet()) {
		System.out.println(m.getKey() + " : " + m.getValue());
	}
}
private static void basisOfName(ArrayList<ProductionFacility> list) {
	
}


	

	private static void highestProduction(ArrayList<ProductionFacility> list) {
		// System.out.println(list);

	}
}
