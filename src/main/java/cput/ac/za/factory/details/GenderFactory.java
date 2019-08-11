package cput.ac.za.factory.details;

import cput.ac.za.domain.info.details.Gender;

public class GenderFactory {

    public static Gender buildGender(String empId, String empGender){
        return new Gender.Builder()
                .empId(empId)
                .empGender(empGender)
                .Build();
    }
}
