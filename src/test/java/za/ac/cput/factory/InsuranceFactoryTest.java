package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Insurance;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertNotNull;
/**
 * InsuranceFactoryTest.java
 * This is the factory test class
 * @aurthor Asimbonge Mbende (221090754)
 * Date: 17 May 2024
 */
class InsuranceFactoryTest {


    @Test
    void buildInsurance() {
        Insurance insurance=InsuranceFactory.buildInsurance(1,"Truck Insurance","Out Surance"
        ,"POL-12345", LocalDate.of(2024, 4, 24),"Truck damage or theft,Natural disasters",1500);
        assertNotNull(insurance);
        System.out.println(insurance.toString());
    }    @Test
    void buildInsuranceFailWithID() {
        Insurance insurance=InsuranceFactory.buildInsurance(-1,"Truck Insurance","Out Surance"
        ,"POL-12345", LocalDate.of(2024, 4, 24),"Truck damage or theft,Natural disasters",1500);
        assertNotNull(insurance);
        System.out.println(insurance.toString());
    }    @Test
    void buildInsuranceFailWithDate() {
        Insurance insurance=InsuranceFactory.buildInsurance(1,"Truck Insurance","Out Surance"
        ,"POL-12345", LocalDate.of(2024, 13, 24),"Truck damage or theft,Natural disasters",1500);
        assertNotNull(insurance);
        System.out.println(insurance.toString());
    }    @Test
    void buildInsuranceFailWithPremium() {
        Insurance insurance=InsuranceFactory.buildInsurance(1,"Truck Insurance","Out Surance"
        ,"POL-12345", LocalDate.of(2024, 4, 24),"Truck damage or theft,Natural disasters",-1);
        assertNotNull(insurance);
        System.out.println(insurance.toString());
    }
}