package cput.ac.za.domain.info.details;

public class EmployeeGender {


    private String empNum;
    private String empGender;


    public EmployeeGender(EmployeeGender.Builder Build) {
        this.empNum = Build.empNum;
        this.empGender = Build.empGender;
    }

    public String getEmpNum() {
        return empNum;
    }

    public String getEmpGender() {
        return empGender;
    }

    @Override
    public String toString() {
        return "Employee Number :" + empNum +
                "\nEmployeeGender  :" + empGender;
    }

    public static class Builder {
        private String empNum;
        private String empGender;

        public Builder empNumber(String empNumber) {
            this.empNum = empNumber;
            return this;
        }

        public Builder gender(String gender) {
            this.empGender = gender;
            return this;
        }


        public Gender.Builder empGender(String empGender) {
            return null;
        }

        public Builder empNum(String empNum) {
            return null;
        }
    }
}
