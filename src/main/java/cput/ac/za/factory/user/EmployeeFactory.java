package cput.ac.za.factory.user;

import cput.ac.za.domain.info.details.EmployeeGender;
import cput.ac.za.domain.info.details.Race;
import cput.ac.za.domain.info.user.Employee;
import cput.ac.za.factory.details.EmployeeGenderFactory;
import cput.ac.za.factory.details.RaceFactory;

public class EmployeeFactory {


    public static Employee buildEmployee(String empNum, String empName, String empSurname, String empGender, String empRace){

        EmployeeGender employeeGenderBuild = EmployeeGenderFactory.buildEmployeeGender(empNum, empGender);
        Race raceBuild = RaceFactory.buildEmpRace(empNum, empRace);
        return new Employee.Builder()
                .empNum(empNum)
                .empName(empName)
                .empSurname(empSurname)
                .empGender(employeeGenderBuild)
                .empRace(raceBuild).Build();
    }
}
