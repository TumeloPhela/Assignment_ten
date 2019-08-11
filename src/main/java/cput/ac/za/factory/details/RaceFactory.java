package cput.ac.za.factory.details;

import cput.ac.za.domain.info.details.Race;

public class RaceFactory {


    public static Race buildEmpRace(String empNum, String empRace){
        return new Race.Builder()
                .empNum(empNum)
                .empRace(empRace)
                .Build();

    }
}
