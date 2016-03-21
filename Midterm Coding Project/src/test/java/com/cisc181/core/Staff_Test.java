package com.cisc181.core;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;
import com.cisc181.eNums.eTitle;
import java.util.Date;
import com.cisc181.core.Staff;
public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}
	
	@Test
	public void testStaff() {
		ArrayList<Staff> StaffMember = new ArrayList<Staff>();
		StaffMember.add(new Staff("Isiah", "T", "Thomas", new Date(1981-3-2), "317 Charm Ct, ABD, NJ", 
				"(732)-123-4567", "it@udel.edu", "Tuesday 3p.m-6p.m", 1, 10000.00,
				new Date (2002-5-11), eTitle.SGT ));
		StaffMember.add(new Staff("Bill", "T", "Lambeer", new Date(1982-2-2), "317 Charm Ct, ABD, NJ", 
				"(732)-123-4597", "bl@udel.edu", "Friday 3p.m-6p.m", 2, 20000.00,
				new Date (2002-6-11), eTitle.MR ));
		StaffMember.add(new Staff("Joe", "T", "Dumars", new Date(1983-3-5), "317 Charm Ct, ABD, NJ", 
				"(732)-153-4767", "jd@udel.edu", "Monday 3p.m-6p.m", 3, 30000.00,
				new Date (2002-9-1), eTitle.Prof ));
		StaffMember.add(new Staff("Dennis", "T", "Rodman", new Date(1984-5-6), "317 Charm Ct, ABD, NJ", 
				"(732)-453-9067", "dr@udel.edu", "Sunday 3p.m-6p.m", 4, 40000.00,
				new Date (2004-7-11), eTitle.MRS ));
		StaffMember.add(new Staff("Mark", "T", "Aguiire", new Date(1985-8-11), "317 Charm Ct, ABD, NJ", 
				"(732)-123-4567", "it@udel.edu", "Saturday 3p.m-6p.m", 5, 50000.00,
				new Date (2002-5-11), eTitle.DR ));
		double Average = (Staff.getSalary(1)+Staff.getSalary(2)+Staff.getSalary(3)+Staff.getSalary(4)+Staff(5)/5);
		assertequals(Average,30000);
	}	

}
