package com.javatunes.personnel;

import static gov.irs.TaxPayer.SALARIED_TAX_RATE;
import static org.junit.Assert.*;

import java.sql.Date;
import org.junit.Before;
import org.junit.Test;

public class SalariedEmployeeTest {

  public static final double SALARY = 69000.0; //actual salary
  public static final double TOLERANCE = 0.001; //tolerance Delta
  public static final double TAX = SALARIED_TAX_RATE * SALARY; //expected salary after tax
  private SalariedEmployee emp;

  @Before
  public void setUp() {
    emp = new SalariedEmployee("Eric James", new Date(120, 02, 15), SALARY);
  }

  @Test
  public void testPay() {
    assertEquals(SALARY, emp.pay(), TOLERANCE);
  }

  @Test
  public void testPayTaxes() {
    assertEquals(TAX, emp.payTaxes(), TOLERANCE);
  }
}