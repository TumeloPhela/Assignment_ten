package cput.ac.za.domain.info.details;

public class Gender {

    private String empGender;
    private String empId;

    public Gender(Builder Build){
        this.empId = Build.empId;
        this.empGender = Build.empGender;
    }

    public String getEmpId() {
        return empId;
    }

    public String getEmpGender() {
        return empGender;
    }

    @Override
    public String toString() {
        return
                "ID      :" + getEmpId()+
                        "\nGender  :" + getEmpGender();
    }

    public static class Builder{
        private String empId;
        private String empGender;

        public Builder empId(String empGender){
            this.empId = empId;
            return this;
        }
        public Builder empGender(String empGender){
            this.empGender = empGender;
            return this;
        }

        public Gender Build(){
            return new Gender(this);
        }
    }

}
