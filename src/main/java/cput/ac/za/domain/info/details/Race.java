package cput.ac.za.domain.info.details;

public class Race {
    private String empNum;
    private String empRace;

    public Race(Builder Build){
        this.empNum = Build.empNum;
        this.empRace = Build.empRace;
    }

    public String getEmpNum() {
        return empNum;
    }

    public String getEmpRace() {
        return empRace;
    }

    @Override
    public String toString() {
        return
                "Employee Number:" + empNum  +
                        "\nRace           :" + empRace ;
    }

    public static class Builder{

        private String empNum;
        private String empRace;

        public Builder empNum(String empNum){
            this.empNum = empNum;
            return this;
        }
        public Builder race(String empRace){
            this.empRace = empRace;
            return this;
        }

        public Race Build(){
            return new Race(this);
        }

        public Builder empRace(String empRace) {
            return null;
        }
    }
}
