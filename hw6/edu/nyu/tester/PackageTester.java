package edu.nyu.tester;
import edu.nyu.hr.Employee;
import edu.nyu.hr.EmployeeType;
import edu.nyu.tax.TaxBracket;
import edu.nyu.hr.DummyPerson;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class PackageTester {

	//should fail
	@Test
	void testNegativeIncome() throws Exception {
		edu.nyu.hr.Employee p1 = new edu.nyu.hr.Employee();
		try {
			p1.setIncome(-60000);
			fail();
		} catch (Exception anyException) {
			throw anyException;
		}
	}
	
	@Test
	void testTaxBracketValues() {
	//	if(TaxBracket.Highest != 40 && TaxBracket.High == 30) {
			
		//}
	}
	
	@Test
	void testTaxRateBracket() throws Exception {
		DummyPerson e = new DummyPerson();
		Employee a = new Employee();
		e.setIncome(35000);
		a.setIncome(10000000);
		
		
		int testIncome = 20;
		int testIncome2 = 40;
		
		Assert.assertEquals(testIncome, e.getTaxRate().getValue());
		Assert.assertEquals(testIncome2, a.getTaxRate().getValue());
	}
	
	
	@Test
	void testEmployeeType() {
		Employee b = new Employee();
		Employee z = new Employee();
		b.setEmployeeType(EmployeeType.FullTime);
		z.setEmployeeType(EmployeeType.PartTime);
		
		Assert.assertEquals(EmployeeType.FullTime, b.getEmployeeType());
		Assert.assertEquals(EmployeeType.PartTime, z.getEmployeeType());
		
	}
	
	
	@Test
	void testCalculateTax() throws Exception {
		Employee a = new Employee();
		
		try {
			a.setIncome(31000);
		} catch (Exception anyException) {
			throw anyException;
		}
		
		int testRate = 6200;
		
		Assert.assertEquals(testRate, a.getIncome() * a.getTaxRate().getValue() / 100);
		
	}

}
