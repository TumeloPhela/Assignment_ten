package cput.ac.za.domain.info.user;

import cput.ac.za.domain.info.details.EmployeeGender;
import cput.ac.za.domain.info.details.Race;

public class Employee {

    private String empNum;
    private String empName;
    private String empSurname;
    private Race empRace;
    private EmployeeGender empGender;

    public Employee(Employee.Builder Build){
        this.empNum = Build.empNum;
        this.empName = Build.empName;
        this.empSurname = Build.empSurname;
        this.empGender = Build.empGender;
        this.empRace = Build.empRace;
    }

    public String getEmpNum() {
        return empNum;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpSurname() {
        return empSurname;
    }
    public EmployeeGender getEmployeeGender(){
        return empGender;
    }

    public Race getEmpRace() {
        return empRace;
    }

    @Override
    public String toString() {
        return
                "Employee Number :'" + empNum +
                        "First Name      :" + empName +
                        "Surname         :" + empSurname +
                        "EmployeeGender  :" + empGender.getEmpGender()+
                        "Race            :" + empRace.getEmpRace()+
                        "From EmployeeGender\n" + empGender +
                        "From Race\n" +empRace;
    }

    public static class Builder{

        public EmployeeGender empGender;
        private String empNum;
        private String empName;
        private String empSurname;

        private Race emprace;
        private Race empRace;

        public Builder empNum(String empNum){
            this.empNum = empNum;
            return this;
        }
        public Builder empName(String fName){
            this.empName = fName;
            return this;
        }
        public Builder empSurname(String empSurname){
            this.empSurname = empSurname;
            return this;
        }
        public Builder empGender(EmployeeGender empGender){
            this.empGender = empGender;
            return this;
        }
        public Builder empRace(Race empRace){
            this.empRace = empRace;
            return this;
        }

        public Employee Build() {
            return new Employee(this);
        }
    }

}
