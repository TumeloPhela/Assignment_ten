package cput.ac.za.factory.details;

import cput.ac.za.domain.info.details.EmployeeGender;

public class EmployeeGenderFactory {

    public static EmployeeGender buildEmployeeGender(String empNum, String empGender){
        return new EmployeeGender.Builder()
                .empNum(empNum)
                .empGender(empGender)
                .Build();
    }
}
