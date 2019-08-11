package cput.ac.za.repository.details;

import cput.ac.za.domain.info.details.EmployeeGender;

import java.util.HashSet;
import java.util.Set;

public class EmployeGenderRepository implements IEmployeeGenderRepository{

    public static EmployeeGenderRepository repository;
    private Set<EmployeeGender> employeeGenders;

    private EmployeeGenderRepository() {
        this.employeeGenders = new HashSet<>();
    }

    public static EmployeeGenderRepository getRepository(){
        if(repository == null) repository = new EmployeeGenderRepository();
        return repository;
    }

    @Override
    public Set<EmployeeGender> getAll() {
        return employeeGenders;
    }

    @Override
    public EmployeeGender create(EmployeeGender employeeGender) {
        if(read(employeeGender.getEmpNum()) == null){
            employeeGenders.add(employeeGender);
        }
        return employeeGender;
    }

    @Override
    public EmployeeGender read(String s) {
        return employeeGenders.stream()
                .filter(employeeGenders -> s.equalsIgnoreCase(empGender.getEmpNum()))
                .findAny()
                .orElse(null);
    }

    @Override
    public EmployeeGender update(EmployeeGender empGender) {

        if(read(empGender.getEmpNum()) != null){
            delete(empGender.getEmpNum());
            create(empGender);
        }
        return empGender;
    }

    @Override
    public void delete(String s) {
        EmployeeGender employeeGender = read(s);
        this.employeeGenders.remove(employeeGender);
    }
}
